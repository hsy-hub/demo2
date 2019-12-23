package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
    public User getUserByid(Integer id);

    public List<User> selectUserAll();
    public User selectUserByid(Integer id);
    public int deleteUserByid(Integer id);

}

