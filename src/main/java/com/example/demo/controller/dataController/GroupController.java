package com.example.demo.controller.dataController;

import com.example.demo.bean.Group;
import com.example.demo.bean.User;
import com.example.demo.service.GroupService;
import com.example.demo.util.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("group")
public class GroupController {

    @Resource
    GroupService  groupService;

    @RequestMapping("/add")
    public Message add(Group group, HttpServletRequest request){
        Message message = new Message();
        String group_name = group.getGroup_name();
        if(group_name == null ||"".equals(group_name)){
            message.setCode(5);
            message.setMessage("group not null");
            return message;
        }
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
       if(user == null){
           message.setCode(3);
           message.setMessage("no login");
           return message;
       }
      System.out.println("u_id :" + user.getId());
        group.setCreateTime(new Date());
        group.setUpdateTime(new Date());
       List<Group> list = groupService.findGroup(group,user);
       if(list.size() > 0){
           message.setCode(4);
           message.setMessage("exist group");
           return message;
       }


        int  result = groupService.add(group,user);
        if(result == 1){
            message.setCode(1);
            message.setMessage("success");
        }else{
            message.setCode(0);
            message.setMessage("fail");
        }
        return message;
    }

    //查询所有分组
    @RequestMapping("/findAll")
    public Message findAll(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("user");
        List<Group> list = groupService.findAll(user);
     Message message = new Message();
        message.setContent(list);
     return message;
    }
}
