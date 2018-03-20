package com.mm.blogvue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.blogvue.dao.TodoListDao;
import com.mm.blogvue.model.ToDoList;
import com.mm.blogvue.service.TodoListService;

@Service
public class TodoListServiceImpl implements TodoListService{
    @Autowired
    private TodoListDao todoListDao;
    public List<ToDoList> selectAllList(){
        return todoListDao.selectAllList();
    }

    public Integer addTodoList(ToDoList toDoList){
        return todoListDao.addTodoList(toDoList);
    }

}
