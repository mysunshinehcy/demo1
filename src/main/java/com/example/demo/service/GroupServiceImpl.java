package com.example.demo.service;

import com.example.demo.bean.Group;
import com.example.demo.bean.User;
import com.example.demo.mapper.GroupMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class GroupServiceImpl implements  GroupService{

    @Resource
    GroupMapper groupMapper;
    @Override
    public int add(Group group,User user) {

        String groupName = group.getGroup_name();
        Date createDate = group.getCreateTime();
        Date updateDate = group.getUpdateTime();
        int u_id = user.getId();
        return groupMapper.add(groupName,createDate,updateDate,u_id);
    }

    @Override
    public List<Group> findAll(User user) {
        return groupMapper.findAll(user);
    }

    @Override
    public List<Group> findMo(User user) {
        return groupMapper.findMo(user);
    }

    @Override
    public List<Group> findGroup(Group group,User user) {


        return groupMapper.findGroup(group.getGroup_name(),user.getId());
    }

    @Override
    public List<Group> findByGroupId(Group group) {
        return groupMapper.findByGroupId(group);
    }
}
