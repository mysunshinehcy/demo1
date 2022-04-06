package com.example.demo.mapper;

import com.example.demo.bean.Group;
import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface GroupMapper {

    public int add(@Param("group_name") String group_name,
                   @Param("createTime") Date createDate,
                  @Param("updateTime")Date updateDate,
                   @Param("u_id")int u_id);

    public List<Group> findAll(User user);

    public List<Group> findMo(User user);

    public List<Group>  findGroup(@Param("group_name")String group_name,
                                  @Param("u_id") int u_id);

    public List<Group>  findByGroupId(Group group);
}
