package com.example.demo.service;



import com.example.demo.bean.User;

import java.util.List;

public interface UserService {
    public List<User> login(User user);
    public int register(User user);

    public List<User>  findByUser(User user);


    public List<User> findUser(User user);
    public List<User>  findById(User user);

    public int update(User user);
}
