package com.example.demo.service;

import com.example.demo.bean.Group;
import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GroupService {
    public int add(Group group,User user);

    public List<Group>  findAll(User user);
    public List<Group>  findMo(User user);

    public List<Group>  findGroup(Group group,User user);
    public List<Group>  findByGroupId(Group group);
}
