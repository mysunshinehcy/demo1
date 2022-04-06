package com.example.demo.service;

import com.example.demo.bean.Image;
import com.example.demo.mapper.ImageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImageServiceImpl implements  ImageService{


    @Resource
    ImageMapper imageMapper;
    @Override
    public List<Image> findAll() {
        return imageMapper.findAll();
    }
}
