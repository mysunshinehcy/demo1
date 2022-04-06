package com.example.demo.controller.dataController;

import com.example.demo.bean.Image;
import com.example.demo.bean.User;
import com.example.demo.service.ImageService;
import com.example.demo.util.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/image")
public class ImageController {

    @Resource
    ImageService imageService;

    @RequestMapping("/findAll")
    public Message findAll(HttpServletRequest request){
        Message message = new Message();
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("user");
        if(user == null){
            message.setCode(3);
            message.setMessage("please login");
            return message;
        }
        List<Image> list = imageService.findAll();
        message.setCode(1);
        message.setContent(list);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("user",user);
        map.put("list",list);
        message.setResult(map);

        return message;
    }
}
