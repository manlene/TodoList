package com.mm.blogvue.service;

import java.util.List;

import com.mm.blogvue.command.TodoListCommand;
import com.mm.blogvue.model.ToDoList;

public interface TodoListService{

    List<TodoListCommand> selectAllList();

    void addTodoList(ToDoList toDoList);
}
