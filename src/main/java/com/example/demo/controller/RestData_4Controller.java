package com.example.demo.controller;

import com.example.demo.bean.Order_4;
import com.example.demo.service.Rest_4Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/data4D")
public class RestData_4Controller {

    @Resource
    Rest_4Service rest_4Service;

    @RequestMapping("/index1")
    public String getIndex1(Order_4 order1){
        return rest_4Service.getIndex1(order1).get(0).getType();
    }

    @RequestMapping("/index2")
    public String getIndex2(Order_4 order2){
        return rest_4Service.getIndex2(order2).get(0).getType();
    }

    @RequestMapping("/index3")
    public String getIndex3(Order_4 order3){
        return rest_4Service.getIndex3(order3).get(0).getType();
    }

    @RequestMapping("/index4")
    public String getIndex4(Order_4 order4){
        return rest_4Service.getIndex4(order4).get(0).getType();
    }

    @RequestMapping("/index5")
    public String getIndex5(Order_4 order5){
        return rest_4Service.getIndex5(order5).get(0).getType();
    }

    @RequestMapping("/index6")
    public String getIndex6(Order_4 order6){
        return rest_4Service.getIndex6(order6).get(0).getType();

    }
    @RequestMapping("/index7")
    public String getIndex7(Order_4 order7){
        return rest_4Service.getIndex7(order7).get(0).getType();
    }

    @RequestMapping("/index8")
    public String getIndex8(Order_4 order8){
        return rest_4Service.getIndex8(order8).get(0).getType();
    }

    @RequestMapping("/index9")
    public String getIndex9(Order_4 order9){
        return rest_4Service.getIndex9(order9).get(0).getType();
    }

    @RequestMapping("/index10")
    public String getIndex10(Order_4 order10){
        return rest_4Service.getIndex10(order10).get(0).getType();
    }
    @RequestMapping("/index11")
    public String getIndex11(Order_4 order11){
        return rest_4Service.getIndex11(order11).get(0).getType();
    }

    @RequestMapping("/index12")
    public String getIndex12(Order_4 order12){
        return rest_4Service.getIndex12(order12).get(0).getType();
    }
@RequestMapping("/index13")
    public String getIndex13(Order_4 order13){
        return rest_4Service.getIndex13(order13).get(0).getType();
    }
    @RequestMapping("/index14")
    public String getIndex14(Order_4 order14){
        return rest_4Service.getIndex14(order14).get(0).getType();
    }

    @RequestMapping("/index15")
    public String getIndex15(Order_4 order15){
        return rest_4Service.getIndex15(order15).get(0).getType();
    }

    @RequestMapping("/index16")
    public String getIndex16(Order_4 order16){
        return rest_4Service.getIndex16(order16).get(0).getType();
    }

    @RequestMapping("/index17")
    public String getIndex17(Order_4 order17){
        return rest_4Service.getIndex17(order17).get(0).getType();
    }

    @RequestMapping("/index18")
    public String getIndex18(Order_4 order18){
        return rest_4Service.getIndex18(order18).get(0).getType();
    }

    @RequestMapping("/index19")
    public String getIndex19(Order_4 order19){
        return rest_4Service.getIndex19(order19).get(0).getType();
    }

    @RequestMapping("/index20")
    public String getIndex20(Order_4 order20){
        return rest_4Service.getIndex20(order20).get(0).getType();
    }

    @RequestMapping("/index21")
    public String getIndex21(Order_4 order21){
        return rest_4Service.getIndex21(order21).get(0).getType();
    }

    @RequestMapping("/index22")
    public String getIndex22(Order_4 order22){
    return rest_4Service.getIndex22(order22).get(0).getType();
    }

    @RequestMapping("/index23")
    public String getIndex23(Order_4 order23){
        return rest_4Service.getIndex23(order23).get(0).getType();
    }

    @RequestMapping("/index24")
    public String getIndex24(Order_4 order24){
        return rest_4Service.getIndex24(order24).get(0).getType();
    }

}
