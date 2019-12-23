package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Mycontroller {

    @Autowired
    UserService userService;

    @RequestMapping("/mybatis/{id}")
    public @ResponseBody
    User getUser(@PathVariable(name="id") Integer id){
        return userService.getUserByid(id);
    }

    @RequestMapping("/test2/{id}")
    public @ResponseBody
    ModelAndView getUser2(@PathVariable(name="id") Integer id){
        ModelAndView mad = new ModelAndView();
        User user = userService.getUserByid(id);
        mad.addObject("user",user);
        mad.setViewName("index.html");
        return mad;
    }

    @RequestMapping("/selectUserAll")
    @ResponseBody
    public List<User> selectUserAll(){
        return userService.selectUserAll();
    }


    @RequestMapping("/selectUserByid/{id}")
     @ResponseBody
    public User selectUserByid(@PathVariable(name="id") Integer id){
        return userService.selectUserByid(id);
    }


    @RequestMapping("/deleteUserByid/{id}")
    @ResponseBody
    public int deleteUserByid(@PathVariable(name="id") Integer id){
        return userService.deleteUserByid(id);
    }

    @Select("select * from user where id=#{id}")
    @Results(id = true,column="uid",property="id"),
}
