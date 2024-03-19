package com.myth2code.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome(){

        return "landing";
    }

    @GetMapping("/employee")
    public String showPageEmployee(){

        return "home";
    }

    @GetMapping("/leaders")
    public String showPageLeaders(){

        return "leaders-page";
    }

    @GetMapping("/systems")
    public String showPageAdmin(){

        return "systems-page";
    }

}
