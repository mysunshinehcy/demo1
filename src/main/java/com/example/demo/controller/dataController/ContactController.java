package com.example.demo.controller.dataController;

import com.example.demo.bean.Contact;
import com.example.demo.bean.Group;
import com.example.demo.bean.User;
import com.example.demo.service.ContactService;
import com.example.demo.service.GroupService;
import com.example.demo.service.UserService;
import com.example.demo.util.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Resource
    ContactService contactService;

    @Resource
    GroupService groupService;

    @Resource
    UserService userService;

    @RequestMapping("/find")
    public Message findContact(HttpServletRequest request){

        Message message = new Message();
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");


        if(user == null){
            message.setCode(3);
            message.setMessage("please login");
            return message;
        }
        //查询user的值
        List<User> listUser = userService.findByUser(user);


        List<Group> groupAll = groupService.findAll(user);

        List<Contact> list = contactService.findByUser(user);

        Map<String,Object> map = new HashMap<String,Object>();

        map.put("user",listUser.get(0));
        map.put("group",groupAll);
        map.put("contact",list);
        message.setResult(map);
        return message;
    }


    @RequestMapping("add")
public Message addContact (HttpServletRequest request,Contact contact){

        Message message = new Message();
HttpSession session = request.getSession();
User user = (User)session.getAttribute("user");
 if(user == null){
     message.setCode(3);
     message.setMessage("please login");
     return message;
 }
        contact.setU_id(user.getId());
        System.out.println("u_id :" + user.getId());
        System.out.println(" contact_name :" + contact.getContact_name());

      //查询用户联系人是否存在
      List<Contact> contactL = contactService.findByContact(contact);
      if(contactL.size() > 0){
          message.setCode(4);
          message.setMessage("contact has exist");
          return message;
      }

      List<User> listU =  userService.findById(user);

        //新建默认分组

        List<Group> list = groupService.findMo(user);
 if(list.size() == 0){
     //新建默认分组
     Group group = new Group();
     group.setGroup_name("goodfriend");
     group.setU_id(user.getId());
     group.setCreateTime(new Date());
     group.setUpdateTime(new Date());

    int result = groupService.add(group,user);
 }

        contact.setU_id(user.getId());
        System.out.println("user_id :" + user.getId());
        contact.setCreateTime(new Date());
        contact.setUpdateTime(new Date());
        contact.setUsername(listU.get(0).getUsername());
        contact.setGroup_name("goodfriend");
        int result = contactService.add(contact);

  if(result == 1){
      message.setCode(1);
      message.setMessage("success");
  }else if(result == 0){
      message.setCode(0);
      message.setMessage("fail");
  }
  return message;
}

@RequestMapping("update")
  public Message update(Contact contact){


     int group_id =  contact.getGroup_id();
     Group group = new Group();
    group.setId(group_id);
    System.out.println("group_id=" + group_id);
    List<Group> lists=  groupService.findByGroupId(group);
    contact.setGroup_name(lists.get(0).getGroup_name());
        int result = contactService.updateContact(contact);
        Message message = new Message();
        if(result == 1){
            message.setCode(1);
            message.setMessage("success");
        }else if(result == 0){
            message.setCode(0);
            message.setMessage("fail");
        }
        return message;
  }


  @RequestMapping("delete")
  public Message delete(HttpServletRequest request, Contact  contact){
      Message message = new Message();
       HttpSession session = request.getSession();
       User user = (User)session.getAttribute("user");
       if(user == null){
           message.setCode(3);
           message.setMessage("please login");
           return message;
       }

       int result = contactService.delete(user,contact);

        if(result == 1){
            message.setCode(1);
            message.setMessage("success");
        }else if(result == 0){
            message.setCode(0);
            message.setMessage("fail");
        }
        return message;

  }


}
