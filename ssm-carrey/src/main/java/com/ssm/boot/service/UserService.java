package com.ssm.boot.service;

import com.ssm.boot.entity.User;

import java.util.List;

/**
 * Created by Carrey on 2018/8/24.
 */
public interface UserService {

    //  添加
    void insert(String id,String userName);

    //  删除
    void delete(String id);

    //  修改
    void update(User user);

    //  查询单个
    User queryUser(String id);

    //  查询多个
    List<User> queryUserList();
}
