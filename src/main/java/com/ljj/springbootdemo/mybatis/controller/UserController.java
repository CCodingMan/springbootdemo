package com.ljj.springbootdemo.mybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.ljj.springbootdemo.mybatis.entity.User;
import com.ljj.springbootdemo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: ljj
 * @Date: 2019/5/3 14:56
 * @Description: 用户控制器
 */
@RestController
@RequestMapping("/mybatis/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUserList")
    public List<User> getUserList(){
        return this.userService.findUserList();
    }

    @GetMapping("/getUser/{id:\\d+}")
    public User getUser(@PathVariable("id") Integer id){
        User user = this.userService.findUser(id);
        return user;
    }

    @PostMapping("/add")
    public void add(@RequestBody JSONObject jsonObject){
        String userName = jsonObject.getString("userName");
        String password = jsonObject.getString("password");
        Integer age = jsonObject.getInteger("age");
        User user = new User(userName, password, age);

        this.userService.add(user);
    }

    @PutMapping("/update/{id:\\d+}")
    public void update(@PathVariable("id") Integer id, @RequestBody JSONObject jsonObject){
        String userName = jsonObject.getString("userName");
        String password = jsonObject.getString("password");
        Integer age = jsonObject.getInteger("age");
        User user = new User(id, userName, password, age);
        this.userService.update(user);
    }

    @DeleteMapping("/delete/{id:\\d+}")
    public void delete(@PathVariable("id") Integer id){
        this.userService.delete(id);
    }
}
