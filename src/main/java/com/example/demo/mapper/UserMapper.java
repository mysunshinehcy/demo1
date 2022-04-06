package com.example.demo.mapper;


import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> login(User user);

    public int register(User user);

    public List<User>  findByUser(User user);

    public List<User> findUser(User user);

    public List<User> findById(User user);

    public int update(User user);
}
