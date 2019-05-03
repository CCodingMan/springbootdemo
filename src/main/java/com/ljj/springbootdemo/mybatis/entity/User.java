package com.ljj.springbootdemo.mybatis.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @Auther: ljj
 * @Date: 2019/5/3 13:00
 * @Description: 用户实体类
 */
public class User {
    @JSONField(name = "id")
    private Integer id;
    @JSONField(name = "userName")
    private String userName;
    @JSONField(name = "password")
    private String password;
    @JSONField(name = "age")
    private Integer age;

    public User() {
    }

    public User(String userName, String password, Integer age) {
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public User(Integer id, String userName, String password, Integer age) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
