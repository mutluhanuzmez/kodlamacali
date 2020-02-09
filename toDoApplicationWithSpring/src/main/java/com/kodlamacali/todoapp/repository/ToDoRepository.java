package com.kodlamacali.todoapp.repository;

import com.kodlamacali.todoapp.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoItem, Long> {

}
