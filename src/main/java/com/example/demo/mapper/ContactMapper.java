package com.example.demo.mapper;

import com.example.demo.bean.Contact;
import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ContactMapper {

    public List<Contact>  findByUser(User user);

    public int add(Contact contact);

    public int update(Contact contact);

    public int delete(@Param("user_id") int user_id,
                      @Param("contact_name") String contact_name);

    public List<Contact>  findContact(Contact contact);
}
