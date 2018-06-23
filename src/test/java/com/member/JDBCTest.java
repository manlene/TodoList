package com.member;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.ibatis.annotations.Case;

import com.alibaba.fastjson.JSON;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JDBCTest{

    private static Connection getConn(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "123456";
        Connection conn = null;
        try{
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

    private static int insert(MemberStatus memberStatus,Connection conn){
        int i = 0;
        String sql = "insert into t_mem_member_behavior_status (member_id,type) values(?,?)";
        PreparedStatement pstmt;
        try{
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, memberStatus.getMemberId());
            pstmt.setString(2, memberStatus.getType());
            i = pstmt.executeUpdate();
            pstmt.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return i;
    }

    public static void main(String args[]){
        Connection conn = getConn();
        ArrayList<String[]> list = new ArrayList<String[]>();
        String[] list1 = { "2", "3" };
        String[] list2 = { "2", "3", "5" };
        String[] list3 = { "2", "3", "4" };
        String[] list4 = { "2", "3", "4", "5" };
        String[] list5 = { "2" };
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        System.out.println(new Date());//TODO:remove
        for (int i = 1; i <=1500000; ++i){
            Integer listTemp = (int) (Math.random() * 5);
            String[] arrayStatus = list.get(listTemp);
            Integer temp = countMap.get(listTemp);
            temp=temp==null?1:++temp;
            countMap.put(listTemp, temp);
            for (int j = 0; j < arrayStatus.length; ++j){
                insert(new MemberStatus(i, arrayStatus[j]), conn);
            }
        }
        try{
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("统计结果:" + JSON.toJSONString(countMap));//TODO:remove
        System.out.println(new Date());//TODO:remove
    }
}
