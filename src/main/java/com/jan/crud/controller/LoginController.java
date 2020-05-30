package com.jan.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Jan
 * @Date 2020/5/18 18:27
 */
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){

        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            session.setAttribute("User",username);
            return "redirect:/main.html";
        }else {
            map.put("msg","用户名或密码错误");
            return "login";
        }
    }
}
