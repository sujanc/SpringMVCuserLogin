package com.stackroute.controller;


import com.stackroute.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

User user =new User();

    @RequestMapping(value = "/")
    public String userLogin(){
        return  "login";
    }



@RequestMapping(value = "user")
    public String greeting(@ModelAttribute("login") User userObj, Model map){

        map.addAttribute("UserName",userObj.getUserName());
        return "index";

    }
}
