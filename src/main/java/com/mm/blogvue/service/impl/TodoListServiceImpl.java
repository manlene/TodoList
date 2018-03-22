package com.mm.blogvue.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.blogvue.command.TodoListCommand;
import com.mm.blogvue.dao.TodoListDao;
import com.mm.blogvue.model.ToDoList;
import com.mm.blogvue.service.TodoListService;

@Service
public class TodoListServiceImpl implements TodoListService{

    @Autowired
    private TodoListDao todoListDao;

    public List<TodoListCommand> selectAllList(){
        List<TodoListCommand> listCommands = new ArrayList<TodoListCommand>();
        List<ToDoList> lists = todoListDao.selectAllList();
        for (Iterator<ToDoList> iterator = lists.iterator(); iterator.hasNext();){
            TodoListCommand todoListCommand = new TodoListCommand();
            ToDoList toDoList = (ToDoList) iterator.next();
            BeanUtils.copyProperties(toDoList, todoListCommand);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd ");
            if (toDoList.getCreateTime()!=null){
                String createTime = formatter.format(toDoList.getCreateTime());
                todoListCommand.setCreateTime(createTime);
            }
            if (toDoList.getUpdateTime()!=null){
                String updateTime = formatter.format(toDoList.getUpdateTime());
                todoListCommand.setUpdateTime(updateTime);
            }
            listCommands.add(todoListCommand);
        }
        return listCommands;
    }

    public void addTodoList(ToDoList toDoList){
        toDoList.setListStatus(1);
        todoListDao.insert(toDoList);
    }

    public void updateListStatusById(ToDoList toDoList){
        toDoList.setUpdateTime(new Date());
        toDoList.setListStatus(2);
        todoListDao.updateListStatusById(toDoList);
        
    }

}
