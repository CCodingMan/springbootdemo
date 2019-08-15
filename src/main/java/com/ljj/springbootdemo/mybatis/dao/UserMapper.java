package com.ljj.springbootdemo.mybatis.dao;

import com.ljj.springbootdemo.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Auther: ljj
 * @Date: 2019/5/3 13:03
 * @Description:
 * 用户映射接口,
 * 若使用注解开发则需要在当前接口类上定义@Mapper或在入口类中加入@MapperScan("com.ljj.springbootdemo.*.dao"),
 * 若为xml开发则省略
 */
public interface UserMapper {
    //注解开发
    @Insert("insert into user(userName, password, age) values(#{user.userName}, #{user.password}, #{user.age})")
    int add(@Param("user") User user);

    @Update("update user set userName = #{user.userName}, password = #{user.password}, age = #{user.age} where id = #{user.id}")
    int update(@Param("user") User user);

    @Delete("delete from user where id = #{id}")
    int delete(@Param("id") Integer id);

    @Select("select * from user where id = #{id}")
    User findUser(@Param("id") Integer id);

    @Select("select * from user")
    List<User> findUserList();

    //xml配置开发
//    int add(User user);
//
//    int update(User user);
//
//    int delete(Integer id);
//
//    User findUser(Integer id);
//
//    List<User> findUserList();
}
