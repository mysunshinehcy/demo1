package com.example.demo.service;

import com.example.demo.bean.Order;
import com.example.demo.mapper.RestMapper;
import com.example.demo.util.Pagenation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RestServiceImpl implements  RestService{

    @Resource
    RestMapper restMapper;
    @Override
    public List<Order> getDemo1(Pagenation pagenation) {
        System.out.println("demo1 service");
        return restMapper.getDemo1(pagenation);
    }

    @Override
    public List<Order> getDemo2(Pagenation pagenation) {
        System.out.println("demo2 service");
        return restMapper.getDemo2(pagenation);
    }

    @Override
    public List<Order> getDemo3(Order order) {
        System.out.println("demo3 service");
        return restMapper.getDemo3(order);
    }


    @Override
    public List<Order> getDemo4(Order order) {
        System.out.println("demo4 service");
        return restMapper.getDemo4( order);
    }

    @Override
    public List<Order> getDemo5(Order order) {
        System.out.println("demo5 service");
        return restMapper.getDemo5(order);
    }

    @Override
    public List<Order> getDemo6(Order order) {
        System.out.println("demo6 service");
        return restMapper.getDemo6(order);
    }

    @Override
    public List<Order> getDemo7(Order order) {
        System.out.println("demo7 service");
        return restMapper.getDemo7(order);
    }

    @Override
    public List<Order> getDemo8(Order order) {
        System.out.println("demo8 service");
        return restMapper.getDemo8(order);
    }

    @Override
    public List<Order> getDemo9(Order order) {
        System.out.println("demo9 service");
        return restMapper.getDemo9(order);
    }

    @Override
    public List<Order> getDemo10(Order order) {
        System.out.println("demo10 service");
        return restMapper.getDemo10(order);
    }

    @Override
    public List<Order> getDemo11(Order order) {
        System.out.println("demo11 service");
        return restMapper.getDemo11(order);
    }

    @Override
    public List<Order> getDemo12(Order order) {
        System.out.println("demo12 service");
        return restMapper.getDemo12(order);
    }

    @Override
    public List<Order> getDemo13(Order order) {
        System.out.println("demo13 service");
        return restMapper.getDemo13(order);
    }

    @Override
    public List<Order> getDemo14(Order order) {
        System.out.println("demo14 service");
        return restMapper.getDemo14(order);
    }

    @Override
    public List<Order> getDemo15(Order order) {
        System.out.println("demo15 service");
        return restMapper.getDemo15(order);
    }

    @Override
    public List<Order> getDemo16(Order order) {
        System.out.println("demo16 service");
        return restMapper.getDemo16(order);
    }

    @Override
    public List<Order> getDemo17(Order order) {
        System.out.println("demo17 service");
        return restMapper.getDemo17(order);
    }

    @Override
    public List<Order> getDemo18(Order order) {
        System.out.println("demo18 service");
        return restMapper.getDemo18(order);
    }

    @Override
    public List<Order> getDemo19(Order order) {
        System.out.println("demo19 service");
        return restMapper.getDemo19(order);
    }

    @Override
    public List<Order> getDemo20(Order order) {
        System.out.println("demo20 service");
        return restMapper.getDemo20(order);
    }

    @Override
    public List<Order> getDemo21(Order order) {
        System.out.println("demo21 service");
        return restMapper.getDemo21(order);
    }

    @Override
    public List<Order> getDemo22(Order order) {
        System.out.println("demo22 service");
        return restMapper.getDemo22(order);
    }

    @Override
    public List<Order> getDemo23(Order order) {
        System.out.println("demo23 service");
        return restMapper.getDemo23( order);
    }

    @Override
    public List<Order> getDemo24(Order order) {
        System.out.println("demo24 service");
        return restMapper.getDemo24( order);
    }
}
