package com.member;

public class MemberStatus{

    private Integer id;

    private Integer memberId;

    private String type;

    public MemberStatus( Integer memberId, String type){
        super();
        this.memberId = memberId;
        this.type = type;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getMemberId(){
        return memberId;
    }

    public void setMemberId(Integer memberId){
        this.memberId = memberId;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

}
