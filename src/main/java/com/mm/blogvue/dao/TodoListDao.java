package com.mm.blogvue.dao;

import java.util.List;

import com.mm.blogvue.model.ToDoList;

public interface TodoListDao{

    List<ToDoList> selectAllList();
    
    Integer insert(ToDoList toDoList);
    
    void updateListStatusById(ToDoList toDoList);
}
