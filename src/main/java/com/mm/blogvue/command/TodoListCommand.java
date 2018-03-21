package com.mm.blogvue.command;

public class TodoListCommand{

    private Integer listId;

    private String listContent;

    private Integer listStatus;

    private String createTime;

    private String updateTime;

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

    public String getCreateTime(){
        return createTime;
    }

    public void setCreateTime(String createTime){
        this.createTime = createTime;
    }

    public String getUpdateTime(){
        return updateTime;
    }

    public void setUpdateTime(String updateTime){
        this.updateTime = updateTime;
    }

}
