package com.ssm.boot.entity;

import java.io.Serializable;

/**
 * Created by Carrey on 2018/8/24.
 */
public class User implements Serializable{

    private static final long serialVersionUID = 1712652846369543990L;
    private String id;
    private String user_name;
    private String password;
    private int age;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String userName) {
        this.user_name = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
