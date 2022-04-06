package com.example.demo.service;

import com.example.demo.bean.Contact;
import com.example.demo.bean.User;

import java.util.List;

public interface ContactService {

    public List<Contact> findByUser(User user);

    public int add(Contact contact);

    public int updateContact(Contact contact);

    public int delete(User user,Contact contact);

    public List<Contact> findByContact(Contact contact);
}
