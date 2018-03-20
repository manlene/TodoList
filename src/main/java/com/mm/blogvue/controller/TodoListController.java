package com.mm.blogvue.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mm.blogvue.model.ToDoList;
import com.mm.blogvue.service.TodoListService;

@Controller
public class TodoListController{
    @Autowired
    private TodoListService todoListService;

    @RequestMapping("/getAllList")
    @ResponseBody
    public ToDoList  getAllList(HttpServletResponse response){
        List<ToDoList> toDoLists = todoListService.selectAllList();
        return toDoLists.get(0);
    }
}
