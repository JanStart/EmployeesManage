package com.jan.crud.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


/**
 * @author 17672
 */
@Controller
public class Hello {

//    @RequestMapping({"/","/login.html"})
//    public String index(){
//        return "index";
//    }

    /**
     *     查出用户数据，在页面展示
     */
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","20");
        return "success";
    }



}
