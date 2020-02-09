package com.kodlamacali.todoapp.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
public class ToDoItem {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String userId;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private boolean isDone;
}
