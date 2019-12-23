package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User getUserByid(Integer id){
       return userDao.getUserByid(id);
    }

    @Override
    public List<User> selectUserAll() {
        return userDao.selectUserAll();
    }

    @Override
    public User selectUserByid(Integer id) {
        return userDao.selectUserByid(id);
    }

    @Override
    public int deleteUserByid(Integer id) {
        return userDao.deleteUserByid(id);
    }
}

