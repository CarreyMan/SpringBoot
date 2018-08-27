package com.ssm.boot.dao;

import com.ssm.boot.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Carrey on 2018/8/24.
 */
@Repository
@Mapper
public interface UserDao {

    //  添加
    @Insert("INSERT INTO `user`(id,user_name) VALUES (#{id},#{userName})")
    void insert(String id,String userName);

    //  删除
    @Delete("DELETE FROM user where id=#{id}")
    void delete(String id);

    //  修改
    @Update("UPDATE user set user_name=#{userName} where id=#{id}")
    void update(User user);

    //  查询单个
    @Select("SELECT * FROM user where id=#{id}")
    User queryUser(String id);

    //  查询多个
    @Select("SELECT * FROM user")
    List<User> queryUserList();



}
