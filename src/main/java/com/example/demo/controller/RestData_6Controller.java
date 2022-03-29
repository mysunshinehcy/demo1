package com.example.demo.controller;

import com.example.demo.bean.Order_6;
import com.example.demo.service.Rest_6Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/data6D")
public class RestData_6Controller {

    @Resource
    Rest_6Service rest_6Service;

    @RequestMapping("/index1")
    public String getIndex1(Order_6 order1){

        return rest_6Service.getIndex1(order1).get(0).getType();
    }

    @RequestMapping("/index2")
    public String getIndex2(Order_6 order2){
        return rest_6Service.getIndex2(order2).get(0).getType();
    }

    @RequestMapping("/index3")
    public String getIndex3(Order_6 order3){
        return rest_6Service.getIndex3(order3).get(0).getType();
    }

    @RequestMapping("/index4")
    public String getIndex4(Order_6 order4){
        return rest_6Service.getIndex4(order4).get(0).getType();
    }

    @RequestMapping("/index5")
    public String getIndex5(Order_6 order5){
        return rest_6Service.getIndex5(order5).get(0).getType();
    }

    @RequestMapping("/index6")
    public String getIndex6(Order_6 order6){
        return rest_6Service.getIndex6(order6).get(0).getType();
    }

    @RequestMapping("/index7")
    public String getIndex7(Order_6 order7){
        return rest_6Service.getIndex7(order7).get(0).getType();
    }

    @RequestMapping("/index8")
    public String getIndex8(Order_6 order8){
        return rest_6Service.getIndex8(order8).get(0).getType();
    }

    @RequestMapping("/index9")
    public String getIndex9(Order_6 order9){
        return rest_6Service.getIndex9(order9).get(0).getType();
    }

    @RequestMapping("/index10")
    public String getIndex10(Order_6 order10){
        return rest_6Service.getIndex10(order10).get(0).getType();
    }

    @RequestMapping("/index11")
    public String getIndex11(Order_6 order11){
        return rest_6Service.getIndex11(order11).get(0).getType();
    }

    @RequestMapping("/index12")
    public String getIndex12(Order_6 order12){
        return rest_6Service.getIndex12(order12).get(0).getType();
    }

    @RequestMapping("/index13")
    public String getIndex13(Order_6 order13){
        return rest_6Service.getIndex13(order13).get(0).getType();
    }

    @RequestMapping("/index14")
    public String getIndex14(Order_6 order14){
       return rest_6Service.getIndex14(order14).get(0).getType();
    }

    @RequestMapping("/index15")
    public String getIndex15(Order_6 order15){
        return rest_6Service.getIndex15(order15).get(0).getType();
    }

    @RequestMapping("/index16")
    public String getIndex16(Order_6 order16){
        return rest_6Service.getIndex16(order16).get(0).getType();
    }

    @RequestMapping("/index17")
    public String getIndex17(Order_6 order17){
        return rest_6Service.getIndex17(order17).get(0).getType();
    }

    @RequestMapping("/index18")
    public String getIndex18(Order_6 order18){
        return rest_6Service.getIndex18(order18).get(0).getType();
    }

    @RequestMapping("/index19")
    public String getindex19(Order_6 order19){
        return rest_6Service.getIndex19(order19).get(0).getType();
    }

    @RequestMapping("/index20")
    public String getIndex20(Order_6 order20){
        return rest_6Service.getIndex20(order20).get(0).getType();
    }

    @RequestMapping("/index21")
    public String getIndex21(Order_6 order21){
        return rest_6Service.getIndex21(order21).get(0).getType();
    }

    @RequestMapping("/index22")
    public String getIndex22(Order_6 order22){
        return rest_6Service.getIndex22(order22).get(0).getType();
    }

    @RequestMapping("/index23")
    public String getIndex23(Order_6 order23){
        return rest_6Service.getIndex23(order23).get(0).getType();
    }

    @RequestMapping("/index24")
    public String getIndex24(Order_6 order24){
        return rest_6Service.getIndex24(order24).get(0).getType();
    }
}
