package com.mm.blogvue.model;

import java.io.Serializable;
import java.sql.Date;

public class ToDoList implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 339677503643013129L;

    private Integer listId;

    private String listContent;

    private Integer listStatus;

    private Date creatTime;

    private Date updateTime;

    public Integer getListId(){
        return listId;
    }

    public void setListId(Integer listId){
        this.listId = listId;
    }

    public String getListContent(){
        return listContent;
    }

    public void setListContent(String listContent){
        this.listContent = listContent;
    }

    public Integer getListStatus(){
        return listStatus;
    }

    public void setListStatus(Integer listStatus){
        this.listStatus = listStatus;
    }

    public Date getCreatTime(){
        return creatTime;
    }

    public void setCreatTime(Date creatTime){
        this.creatTime = creatTime;
    }

    public Date getUpdateTime(){
        return updateTime;
    }

    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

}
