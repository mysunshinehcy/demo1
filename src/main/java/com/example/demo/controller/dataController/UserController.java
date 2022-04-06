package com.example.demo.controller.dataController;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import com.example.demo.util.Message;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    UserService  userService;

    @RequestMapping("/login")
    public Message login(User user, HttpServletResponse response, HttpServletRequest request){
        Message message = new Message();
        String username = user.getUsername();
        String password = user.getPassword();
        if( username == null || "".equals(username)){
            message.setCode(4);
            message.setMessage("账号不能为空");
            return  message;
        }
        if(password == null || "".equals(password)){
            message.setCode(5);
            message.setMessage("密码不能为空");
            return message;
        }
        HttpSession session = request.getSession();
        List<User> list = userService.login(user);

      if(list.size() != 0){
          message.setCode(1);
          message.setMessage("success");
          session.setAttribute("user",list.get(0));
      }else{
          message.setCode(0);
          message.setMessage("fail");
      }
      return message;
    }

    @RequestMapping("getUser")
    public Message getUser(HttpServletRequest request){
       HttpSession session = request.getSession();
       User user = (User)session.getAttribute("user");
       Message message = new Message();
       List<User> list = new ArrayList<User>();
        list.add(user);
       if(user != null){
           message.setCode(1);
           message.setMessage("success");
           message.setContent(list);
       }else{
           message.setCode(0);
           message.setMessage("fail");
       }
       return message;
    }

    @RequestMapping("register")
    public Message register(User user){
        Message message = new Message();
        String username = user.getUsername();
        String password = user.getPassword();
        if(username == null || "".equals(username)){
            message.setCode(3);
            message.setMessage("empty username");
            return message;
        }

        if(password == null || "".equals(password)){
            message.setCode(4);
            message.setMessage("empty password");
            return message;
        }


        user.setCreateDate(new Date());
        user.setUpdateDate(new Date());
      List<User> list = userService.findByUser(user);
      if(list.size() > 0){
          message.setCode(2);
          message.setMessage("same");
          return message;
      }

        System.out.println("later");
        int result = userService.register(user);

if(result == 1){
    message.setCode(1);
    message.setMessage("success");
}else{
    message.setCode(0);
    message.setMessage("fail");
}
return message;

    }

    @RequestMapping("logout")
    public void logout(HttpServletRequest request){
      HttpSession session = request.getSession();
        session.setAttribute("user","");

    }

    @RequestMapping("/findAll")
    public Message findAll(HttpServletRequest request){
        Message message = new Message();
HttpSession session = request.getSession();
User user = (User)session.getAttribute("user");
     if(user == null){
         message.setCode(3);
         return message;
     }
     System.out.println("u_id :" + user.getId() );

        List<User> list = userService.findUser(user);

        message.setContent(list);
        return message;
    }


    @RequestMapping("update")
    public Message update(User user,HttpServletRequest request){
        Message message = new Message();
        HttpSession session = request.getSession();
        User userR = (User)session.getAttribute("user");
        if(userR == null){
            message.setCode(3);
            message.setMessage("please login");
            return message;
        }
        user.setId(userR.getId());
        System.out.println("u_id =" + userR.getId());
        System.out.println("head_img:" + user.getHead_img());
        int result = userService.update(user);
       if(result == 1){
            message.setCode(1);
            message.setMessage("success");
        }else{
            message.setCode(0);
            message.setMessage("fail");
        }
        return message;
    }

}
