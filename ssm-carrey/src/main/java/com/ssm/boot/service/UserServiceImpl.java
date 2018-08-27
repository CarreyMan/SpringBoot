package com.ssm.boot.service;

import com.ssm.boot.dao.UserDao;
import com.ssm.boot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

/**
 * Created by Carrey on 2018/8/24.
 */
@Service
@EnableTransactionManagement    //  事务
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void insert(String id, String userName) {
        userDao.insert(id,userName);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User queryUser(String id) {
        return userDao.queryUser(id);
    }

    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }
}
