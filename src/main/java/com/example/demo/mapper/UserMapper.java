package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> selectUserAll();

    @Select("select * from user where id=#{id}")
    public User selectUserByid(Integer id);

    @Delete("delete from user where id=#{id}")
    public int deleteUserByid(Integer id);
}
