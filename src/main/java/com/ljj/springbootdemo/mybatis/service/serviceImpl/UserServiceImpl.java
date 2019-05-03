package com.ljj.springbootdemo.mybatis.service.serviceImpl;

import com.ljj.springbootdemo.mybatis.dao.UserMapper;
import com.ljj.springbootdemo.mybatis.entity.User;
import com.ljj.springbootdemo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: ljj
 * @Date: 2019/5/3 13:22
 * @Description: 用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        return this.userMapper.add(user);
    }

    @Override
    public int update(User user) {
        return this.userMapper.update(user);
    }

    @Override
    public int delete(Integer id) {
        return this.userMapper.delete(id);
    }

    @Override
    public User findUser(Integer id) {
        return this.userMapper.findUser(id);
    }

    @Override
    public List<User> findUserList() {
        return this.userMapper.findUserList();
    }
}
