package com.mm.blogvue.service;

import java.util.List;

import com.mm.blogvue.command.TodoListCommand;
import com.mm.blogvue.model.ToDoList;

public interface TodoListService{
    /**
     * 查询所有todolist
     * @return
     */
    List<TodoListCommand> selectAllList();
    /**
     * 新增todolist
     * @param toDoList
     */
    ToDoList addTodoList(ToDoList toDoList);
    /**
     * 根据id更新todolist状态
     * @param toDoList
     */
    void updateListStatusById(ToDoList toDoList);
}
