package com.example.demo.dao;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public User getUserByid(Integer id) {
        return jdbcTemplate.queryForObject("select * from user where id=?",
                new BeanPropertyRowMapper<>(User.class), id);
    }

    @Autowired
    UserMapper userMapper;

    public List<User> selectUserAll(){
        return userMapper.selectUserAll();
    }

    public User selectUserByid(Integer id) {
        return userMapper.selectUserByid(id);
    }

    public int deleteUserByid(Integer id) {
        return userMapper.deleteUserByid(id);
    }

}
