package com.example.demo.controller;


import com.example.demo.bean.Order;
import com.example.demo.bean.Order_2;
import com.example.demo.mapper.Rest_2Mapper;
import com.example.demo.service.Rest_2Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/data2D")
public class RestData2Controller {


    @Resource
    Rest_2Service rest_2Service;

    @RequestMapping("/getDemo1")
    public String getIndex1( Order_2 order1){
        System.out.println("data2 index1");
        System.out.println("u_id :" + order1.getU_id());
        return rest_2Service.getIndex1(order1).get(0).getType();
    }

    @RequestMapping("/getDemo2")
    public String getIndex2( Order_2 order2){
        System.out.println("data2 index2");
        System.out.println("uid:"+order2.getU_id());
        return rest_2Service.getIndex2(order2).get(0).getType();
    }

    @RequestMapping("/getDemo3")
    public String getIndex3( Order_2 order3){
        System.out.println("data2 index3");
        System.out.println("u_id:"+ order3.getU_id());
        return rest_2Service.getIndex3(order3).get(0).getType();
    }

    @RequestMapping("/getDemo4")
    public String getIndex4( Order_2 order4){
        System.out.println("data2 index4");
        System.out.println("u_id:"+ order4.getU_id());
        return rest_2Service.getIndex4(order4).get(0).getType();
    }

    @RequestMapping("/getDemo5")
    public String getIndex5( Order_2 order5){
        System.out.println("data2 index5");
        System.out.println("u_id :" + order5.getU_id());
        return rest_2Service.getIndex5(order5).get(0).getType();
    }

    @RequestMapping("/getDemo6")
    public String getIndex6( Order_2 order6){
        System.out.println("data2 index6");
        System.out.println("u-Id :"+order6.getU_id());
        return rest_2Service.getIndex6(order6).get(0).getType();
    }

    @RequestMapping("/getDemo7")
    public String getIndex7( Order_2 order7){
        System.out.println("data2 index7");
        System.out.println(" u_id :"+ order7.getU_id());
        return rest_2Service.getIndex7(order7).get(0).getType();
    }

    @RequestMapping("/getDemo8")
    public String getIndex8( Order_2 order8){
        System.out.println("data2 index8");
        System.out.println(" u_id :"+ order8.getU_id());
        return rest_2Service.getIndex8(order8).get(0).getType();
    }

    @RequestMapping("/getDemo9")
    public String getIndex9( Order_2 order9){
        System.out.println("data2 index9");
        System.out.println("u_id :"+order9.getU_id() );
        return rest_2Service.getIndex9(order9).get(0).getType();
    }

    @RequestMapping("/getDemo10")
    public String getIndex10( Order_2 order10){

        System.out.println("data2 index10");
        System.out.println("u_id :"+ order10.getU_id());
        return rest_2Service.getIndex10(order10).get(0).getType();
    }

    @RequestMapping("/getDemo11")
    public String getIndex11( Order_2 order11){
        System.out.println("data2 index11");
        System.out.println("u_id :"+order11.getU_id() );
        return rest_2Service.getIndex11(order11).get(0).getType();
    }

    @RequestMapping("/getDemo12")
    public String getIndex12( Order_2 order12){

        System.out.println("data2 index12");
        System.out.println(" u_id :"+ order12.getU_id());
        return rest_2Service.getIndex12(order12).get(0).getType();
    }

    @RequestMapping("/getDemo13")
    public String getIndex13( Order_2 order13){
        System.out.println("data2 index13");
        System.out.println("u_id :"+ order13.getU_id());
        return rest_2Service.getIndex13(order13).get(0).getType();
    }

    @RequestMapping("/index14")
    public String getIndex14( Order_2 order14){
        System.out.println("data2 index14");
        System.out.println(" u_id :"+ order14.getU_id());
        return rest_2Service.getIndex14(order14).get(0).getType();
    }

    @RequestMapping("/index15")
    public String getIndex15( Order_2 order15 ){
        System.out.println("data2 index15");
        System.out.println("u_id :"+ order15.getU_id());
        return rest_2Service.getIndex15(order15).get(0).getType();
    }

    @RequestMapping("/index16")
    public String getIndex16( Order_2 order16){
        System.out.println("data2 index16");
        System.out.println("u_id :"+ order16.getU_id());
        return rest_2Service.getIndex16(order16).get(0).getType();
    }

    @RequestMapping("/index17")
    public String getIndex17( Order_2 order17){
        System.out.println("data2 index17");
        System.out.println("u_id :"+ order17.getU_id());
        return rest_2Service.getIndex17(order17).get(0).getType();
    }

    @RequestMapping("/index18")
    public String getIndex18( Order_2 order18){

        System.out.println("data2 index18");
        System.out.println("u_id :" + order18.getU_id());
        return rest_2Service.getIndex18(order18).get(0).getType();
    }

    @RequestMapping("/index19")
    public String getIndex19( Order_2 order19){
        System.out.println("data2 index19");
        System.out.println("u_id :"+ order19.getU_id());
        return rest_2Service.getIndex19(order19).get(0).getType();
    }

    @RequestMapping("/index20")
    public String getIndex20( Order_2 order20){

        System.out.println("data2 index20");
        System.out.println("u_id :"+ order20.getU_id());
        return rest_2Service.getIndex20(order20).get(0).getType();
    }

    @RequestMapping("/index21")
    public String getIndex21( Order_2 order21){
        System.out.println("data2 index21");
        System.out.println("u_id :"+ order21.getU_id());
        return rest_2Service.getIndex21(order21).get(0).getType();
    }

    @RequestMapping("/index22")
    public String getIndex22( Order_2 order22){

        System.out.println("data2 index22");
        System.out.println("u_id:"+ order22.getU_id());
        return rest_2Service.getIndex22(order22).get(0).getType();
    }

    @RequestMapping("/index23")
    public String getIndex23( Order_2 order23){
        System.out.println("data2 index23");
        System.out.println("u_id :"+ order23.getU_id());
        return rest_2Service.getIndex23(order23).get(0).getType();
    }

    @RequestMapping("/index24")
    public String getIndex24(Order_2 order24){
        System.out.println("data2 index24");
        System.out.println("u_id:"+ order24.getU_id());
        return rest_2Service.getIndex24(order24).get(0).getType();
    }

}
