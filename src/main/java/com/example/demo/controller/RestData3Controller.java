package com.example.demo.controller;

import com.example.demo.bean.Order_3;
import com.example.demo.service.Rest_3Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/data3D")
public class RestData3Controller {

    @Resource
    Rest_3Service rest_3Service;

    @RequestMapping("/getIndex1")
    public String getIndex1(Order_3 order1){
        System.out.println("data3 index1");
        return rest_3Service.getIndex1(order1).get(0).getType();
    }

    @RequestMapping("/getIndex2")
    public String getIndex2(Order_3 order2){

        System.out.println("data3 index2");
        return rest_3Service.getIndex2(order2).get(0).getType();
    }

    @RequestMapping("/getIndex3")
    public String getIndex3(Order_3 order3){
        System.out.println("data3 index3");
        return rest_3Service.getIndex3(order3).get(0).getType();
    }

    @RequestMapping("/getIndex4")
    public String getIndex4(Order_3 order4){
        System.out.println("data3 index4");
        return rest_3Service.getIndex4(order4).get(0).getType();
    }

    @RequestMapping("/getIndex5")
    public String getIndex5(Order_3 order5){

        System.out.println("data3 index5");
        return rest_3Service.getIndex5(order5).get(0).getType() ;
    }

    @RequestMapping("/getIndex6")
    public String getIndex6(Order_3 order6){

        System.out.println("data3 index6");
        return rest_3Service.getIndex6(order6).get(0).getType();
    }

    @RequestMapping("/getIndex7")
    public String getIndex7(Order_3 order7){
        System.out.println("data3 index7");
        return rest_3Service.getIndex7(order7).get(0).getType();
    }

    @RequestMapping("/getIndex8")
    public String getIndex8(Order_3 order8){
        System.out.println("data3 index8");
        return rest_3Service.getIndex8(order8).get(0).getType();
    }

    @RequestMapping("/getIndex9")
    public String getIndex9(Order_3 order9){
        System.out.println("data3 index9");
        return rest_3Service.getIndex9(order9).get(0).getType();
    }

    @RequestMapping("/getIndex10")
    public String getIndex10(Order_3 order10){
        System.out.println("data3 index10");
        return rest_3Service.getIndex10(order10).get(0).getType();
    }

    @RequestMapping("/getIndex11")
    public String getIndex11(Order_3 order11){

        System.out.println("data3 index11");
        return rest_3Service.getIndex11(order11).get(0).getType();
    }

    @RequestMapping("/getIndex12")
    public String getIndex12(Order_3 order12){
        System.out.println("data3 index12");
        return rest_3Service.getIndex12(order12).get(0).getType();
    }

    @RequestMapping("/getIndex13")
    public String getIndex13(Order_3 order13){
        System.out.println("data3 index13");
        return rest_3Service.getIndex13(order13).get(0).getType();
    }

    @RequestMapping("/getIndex14")
    public String getIndex14(Order_3 order14){
        System.out.println("data3 index14");
        return rest_3Service.getIndex14(order14).get(0).getType();
    }

    @RequestMapping("/getIndex15")
    public String getIndex15(Order_3 order15){
        System.out.println("data3 index15");
        return rest_3Service.getIndex15(order15).get(0).getType();
    }

    @RequestMapping("/getIndex16")
    public String getIndex16(Order_3 order16){
        System.out.println("data3 index16");
        return rest_3Service.getIndex16(order16).get(0).getType();
    }

    @RequestMapping("/getIndex17")
    public String getIndex17(Order_3 order17){
        System.out.println("data3 index17");
        return rest_3Service.getIndex17(order17).get(0).getType();
    }

    @RequestMapping("/getIndex18")
    public String getIndex18(Order_3 order18){
        System.out.println("data3 index18");
        return rest_3Service.getIndex18(order18).get(0).getType();
    }

    @RequestMapping("/getIndex19")
    public String getIndex19(Order_3 order19){
        System.out.println("data3 index19");
        return rest_3Service.getIndex19(order19).get(0).getType();
    }

    @RequestMapping("/getIndex20")
    public String getIndex20(Order_3 order20){
        System.out.println("data3 index20");
        return rest_3Service.getIndex20(order20).get(0).getType();
    }

    @RequestMapping("/getIndex21")
    public String getIndex21(Order_3 order21){
        System.out.println("data3 index21");
        return rest_3Service.getIndex21(order21).get(0).getType();
    }

    @RequestMapping("/getIndex22")
    public String getIndex22(Order_3 order22){
        System.out.println("data3 index22");
        return rest_3Service.getIndex22(order22).get(0).getType();
    }

    @RequestMapping("/getIndex23")
    public String getIndex23(Order_3 order23){
        System.out.println("data3 index23");
        return rest_3Service.getIndex23(order23).get(0).getType();
    }

    @RequestMapping("/getIndex24")
    public String getIndex24(Order_3 order24){
        System.out.println("data3 index24");
        return rest_3Service.getIndex24(order24).get(0).getType();
    }
}
