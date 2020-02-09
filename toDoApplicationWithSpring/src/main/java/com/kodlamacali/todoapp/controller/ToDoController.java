package com.kodlamacali.todoapp.controller;

import com.kodlamacali.todoapp.model.ToDoItem;
import com.kodlamacali.todoapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("todo")
public class ToDoController {

    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping("/getAllTodoList")
    public List<ToDoItem> getAllToDoItems() {
        List<ToDoItem> itemList = toDoRepository.findAll();
        return itemList;
    }

    @PostMapping("/addToDoItem")
    public void addToDoItem(@RequestBody ToDoItem inItem) {
        ToDoItem item = new ToDoItem();
        item.setContent(inItem.getContent());
        item.setDone(inItem.isDone());
        item.setTitle(inItem.getTitle());
        item.setUserId(inItem.getUserId());
        toDoRepository.save(item);
    }

    @PostMapping("/deleteToDoItemById")
    public void deleteToDoItemById(@RequestParam Long id) {
        Optional<ToDoItem> item = toDoRepository.findById(id);

        if(item.isPresent()){
            toDoRepository.delete(item.get());
        }
    }
}
