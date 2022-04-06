package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> login(User user) {
        return userMapper.login(user);
    }

    @Override
    public int register(User user) {
        return userMapper.register(user);
    }

    @Override
    public List<User> findByUser(User user) {
        return userMapper.findByUser(user);
    }

    @Override
    public List<User> findUser(User user) {

        return userMapper.findUser(user);
    }

    @Override
    public List<User> findById(User user) {
        return userMapper.findById(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }
}
