package com.example.demo.service;

import com.example.demo.bean.Contact;
import com.example.demo.bean.User;
import com.example.demo.mapper.ContactMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactServiceImpl implements  ContactService{

    @Resource
    ContactMapper contactMapper;

    @Override
    public List<Contact> findByUser(User user) {
        return contactMapper.findByUser(user);
    }


    @Override
    public int add(Contact contact) {
        return contactMapper.add(contact);
    }


    @Override
    public int updateContact(Contact contact) {
        return contactMapper.update(contact);
    }

    @Override
    public int delete(User user , Contact contact) {
        int user_id = user.getId();
        String contact_name = contact.getContact_name();
        return contactMapper.delete(user_id,contact_name);
    }

    @Override
    public List<Contact> findByContact(Contact contact) {
        return contactMapper.findContact(contact);
    }
}
