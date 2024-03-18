package com.myth2code.com.myth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String showPageLogin(){

        return "sign-in";
    }

    @GetMapping("/admin")
    public String showPageAdmin(){
        return "home-admin";
    }



}
