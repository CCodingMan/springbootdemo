package com.ljj.springbootdemo.mybatis.service;

import com.ljj.springbootdemo.mybatis.entity.User;

import java.util.List;

/**
 * @Auther: ljj
 * @Date: 2019/5/3 13:16
 * @Description: 用户接口
 */
public interface UserService {
    int add(User user);

    int update(User user);

    int delete(Integer id);

    User findUser(Integer id);

    List<User> findUserList();
}
