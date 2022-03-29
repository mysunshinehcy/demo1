package com.example.demo.controller;

import com.example.demo.bean.Order;
import com.example.demo.mapper.RestMapper;
import com.example.demo.service.RestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class Rest1Controller {

    @Resource
    RestService restService;

    @RequestMapping("/getDemo1" )
    public String getDemo1(HttpServletResponse response,Order order){
        response.addHeader("Access-Control-Allow-Origin","*");//允许所有来源访问
        response.addHeader("Access-Control-Allow-Methods","*");//允许访问的方式
        System.out.print(restService.getDemo1(order).get(0));
        return restService.getDemo1(order).get(0).getType();
    }


    @RequestMapping("/getDemo2")
    public String  getDemo2(HttpServletResponse response,Order order){
      return restService.getDemo2(order).get(0).getType();
    }

    @RequestMapping("/getDemo3")
    public String getDemo3(HttpServletResponse response,Order order){
        return restService.getDemo3(order).get(0).getType();
    }

    @RequestMapping("/getDemo4")
   public String getDemo4(HttpServletResponse response,Order order){
        return restService.getDemo4(order).get(0).getType();
   }

   @RequestMapping("/getDemo5")
   public String getDemo5(HttpServletResponse response,Order order){
        return restService.getDemo5(order).get(0).getType();
   }

   @RequestMapping("/getDemo6")
   public String getDemo6(HttpServletResponse response,Order order){
        return restService.getDemo6(order).get(0).getType();
   }

   @RequestMapping("/getDemo7")
   public String getDemo7(HttpServletResponse response,Order order){
        return restService.getDemo7(order).get(0).getType();
   }

   @RequestMapping("/getDemo8")
   public String getDemo8(HttpServletResponse response,Order order){
        return restService.getDemo8(order).get(0).getType();
   }

   @RequestMapping("/getDemo9")
   public String getDemo9(HttpServletResponse response,Order order){
        return restService.getDemo9(order).get(0).getType();
   }

   @RequestMapping("/getDemo10")
   public String getDemo10(HttpServletResponse response,Order order){
        return restService.getDemo10(order).get(0).getType();
   }

   @RequestMapping("/getDemo11")
   public String getDemo11(HttpServletResponse response,Order order){
        return restService.getDemo11(order).get(0).getType();
   }

   @RequestMapping("/getDemo12")
   public String getDemo12(HttpServletResponse response,Order order){
        return restService.getDemo12(order).get(0).getType();
   }

   @RequestMapping("/getDemo13")
   public String getDemo13(HttpServletResponse response,Order order){
        return restService.getDemo13(order).get(0).getType();
   }

   @RequestMapping("/getDemo14")
   public String getDemo14(HttpServletResponse response,Order order){
        return restService.getDemo14(order).get(0).getType();
   }

   @RequestMapping("/getDemo15")
   public String getDemo15(HttpServletResponse response,Order order){
        return restService.getDemo15(order).get(0).getType();
   }

   @RequestMapping("/getDemo16")
   public String getDemo16(HttpServletResponse response,Order order){
        return restService.getDemo16(order).get(0).getType();
   }

   @RequestMapping("/getDemo17")
   public String getDemo17(HttpServletResponse response,Order order){
        return restService.getDemo17(order).get(0).getType();
   }

   @RequestMapping("/getDemo18")
   public String getDemo18(HttpServletResponse response,Order order){
        return restService.getDemo18(order).get(0).getType();
   }

   @RequestMapping("/getDemo19")
   public String getDemo19(HttpServletResponse response,Order order){
        return restService.getDemo19(order).get(0).getType();
   }

   @RequestMapping("/getDemo20")
   public String getDemo20(HttpServletResponse response,Order order){
        return restService.getDemo20(order).get(0).getType();
   }

   @RequestMapping("/getDemo21")
   public String getDemo21(HttpServletResponse response,Order order){
        return restService.getDemo21(order).get(0).getType();
   }

   @RequestMapping("/getDemo22")
   public String getDemo22(HttpServletResponse response,Order order){
        return restService.getDemo22(order).get(0).getType();
   }

   @RequestMapping("/getDemo23")
   public String getDemo23(HttpServletResponse response,Order order){
        return restService.getDemo23(order).get(0).getType();
   }

   @RequestMapping("/getDemo24")
   public String getDemo24(HttpServletResponse response,Order order){
        return restService.getDemo24(order).get(0).getType();
   }
}
