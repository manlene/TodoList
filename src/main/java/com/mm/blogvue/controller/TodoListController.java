package com.mm.blogvue.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mm.blogvue.command.TodoListCommand;
import com.mm.blogvue.model.ToDoList;
import com.mm.blogvue.service.TodoListService;

@Controller
public class TodoListController{

    @Autowired
    private TodoListService todoListService;

    @RequestMapping("/getAllList")
    @ResponseBody
    public List<TodoListCommand> getAllList(HttpServletResponse response){
        List<TodoListCommand> toDoLists = todoListService.selectAllList();
        return toDoLists;
    }

    @RequestMapping("/addList")
    @ResponseBody
    public ToDoList addList(HttpServletResponse response,@RequestBody ToDoList toDoList,HttpServletRequest request){
        //        try{
        //            ServletInputStream inputStream = request.getInputStream();
        //            StringBuilder sb = new StringBuilder();
        //            byte[] bytes=new byte[1024];
        //            while (inputStream.read(bytes)!=-1){
        //                sb.append(new String(bytes));
        //            }
        //            String string = sb.toString();
        //            System.out.println(string);//TODO:remove
        //        }catch (IOException e){
        //            // TODO Auto-generated catch block
        //            e.printStackTrace();
        //        }
        ToDoList list = todoListService.addTodoList(toDoList);
        return list;
    }

    @RequestMapping("/updateTodoListById")
    @ResponseBody
    public void updateTodoListById(HttpServletResponse response,@RequestBody ToDoList toDoList,HttpServletRequest request){

        todoListService.updateListStatusById(toDoList);
    }
}
