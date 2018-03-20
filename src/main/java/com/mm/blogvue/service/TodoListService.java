package com.mm.blogvue.service;

import java.util.List;

import com.mm.blogvue.model.ToDoList;

public interface TodoListService{

    List<ToDoList> selectAllList();

    Integer addTodoList(ToDoList toDoList);
}
