package com.example.demo.mapper;

import com.example.demo.bean.Image;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ImageMapper {

    public List<Image> findAll();

}
