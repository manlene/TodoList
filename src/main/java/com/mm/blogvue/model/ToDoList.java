package com.mm.blogvue.model;

import java.io.Serializable;
import java.util.Date;

public class ToDoList implements Serializable{

    private Integer listId;

    private String listContent;

    private Integer listStatus;

    private Date createTime;

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

    public Date getCreateTime(){
        return createTime;
    }

    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    public Date getUpdateTime(){
        return updateTime;
    }

    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

}
