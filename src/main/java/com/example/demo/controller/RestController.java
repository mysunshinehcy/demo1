package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestController {


    @RequestMapping("/index1")
    public ModelAndView getDemo(){
        System.out.println("aaaa");
        ModelAndView mo = new ModelAndView("jsp1/index1");

        return mo;

    }
@RequestMapping("/index2")
    public ModelAndView getDemo2(){
        ModelAndView mo = new ModelAndView("jsp1/index2");
        return mo;
    }

    @RequestMapping("/index3")
    public ModelAndView getDemo3(){
        ModelAndView mo = new ModelAndView("jsp1/index3");
        return mo;
    }

    @RequestMapping("/index4")
    public ModelAndView getDemo4(){
        ModelAndView mo = new ModelAndView("jsp1/index4");
        return mo;
    }

    @RequestMapping("/index5")
    public ModelAndView getDemo5(){
        ModelAndView mo = new ModelAndView("jsp1/index5");
        return mo;
    }

    @RequestMapping("/index6")
    public ModelAndView getDemo6(){
        ModelAndView mo = new ModelAndView("jsp1/index6");
        return mo;
    }

    @RequestMapping("/index7")
    public ModelAndView getDemo7(){
        ModelAndView mo = new ModelAndView("jsp1/index7");
        return mo;
    }


    @RequestMapping("/index8")
    public ModelAndView  getDemo8(){
        ModelAndView mo = new ModelAndView("jsp1/index8");
        return mo;
    }

    @RequestMapping("/index9")
    public ModelAndView getDemo9(){
        ModelAndView mo = new ModelAndView("jsp1/index9");
        return mo;
    }

    @RequestMapping("/index10")
    public ModelAndView getDemo10(){
        ModelAndView mo = new ModelAndView("jsp1/index10");
        return mo;
    }

    @RequestMapping("/index11")
    public ModelAndView getDemo11(){
        ModelAndView mo = new ModelAndView("jsp1/index11");
        return mo;
    }

    @RequestMapping("/index12")
    public ModelAndView getDemo12(){
        ModelAndView mo = new ModelAndView("jsp1/index12");
        return mo;
    }

    @RequestMapping("/index13")
    public ModelAndView getDemo13(){
        ModelAndView mo = new ModelAndView("jsp1/index13");
        return mo;
    }

    @RequestMapping("/index14")
    public ModelAndView getDemo14(){
        ModelAndView mo = new ModelAndView("jsp1/index14");
        return mo;
    }

    @RequestMapping("/index15")
    public ModelAndView getDemo15(){
        ModelAndView mo = new ModelAndView("jsp1/index15");
        return mo;
    }

    @RequestMapping("/index16")
    public ModelAndView getDemo16(){
        ModelAndView mo = new ModelAndView("jsp1/index16");
        return mo;
    }

    @RequestMapping("/index17")
    public ModelAndView getDemo17(){
        ModelAndView mo = new ModelAndView("jsp1/index17");
        return mo;
    }

    @RequestMapping("/index18")
    public ModelAndView getDemo18(){
        ModelAndView mo = new ModelAndView("jsp1/index18");
        return mo;
    }

    @RequestMapping("/index19")
    public ModelAndView getDemo19(){
        ModelAndView mo = new ModelAndView("jsp1/index19");
        return mo;
    }

    @RequestMapping("/index20")
    public ModelAndView getDemo20(){
        ModelAndView mo = new ModelAndView("jsp1/index20");
        return mo;
    }

    @RequestMapping("/index21")
    public ModelAndView getDemo21(){
        ModelAndView mo = new ModelAndView("jsp1/index21");
        return mo;
    }

    @RequestMapping("/index22")
    public ModelAndView getDemo22(){
        ModelAndView mo = new ModelAndView("jsp1/index22");
        return mo;
    }

    @RequestMapping("/index23")
    public ModelAndView getDemo23(){
        ModelAndView mo = new ModelAndView("jsp1/index23");
        return mo;
    }

    @RequestMapping("/index24")
    public ModelAndView getDemo24(){
        ModelAndView mo = new ModelAndView("jsp1/index24");
        return mo;
    }

}
