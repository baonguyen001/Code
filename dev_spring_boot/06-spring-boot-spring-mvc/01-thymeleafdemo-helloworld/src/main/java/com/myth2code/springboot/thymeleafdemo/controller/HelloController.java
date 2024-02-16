package com.myth2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    // Phương thức Show Form nhập thông tin
    @RequestMapping("/showForm")
    public String showForm(){

        return "helloworld-form";
    }

    // Phương thức truy xuất đến Form sau khi xử lý
    @RequestMapping("/processForm")
    public String processForm(){

        return "helloworld";
    }

    // Tạo Phương thức đọc dữ liệu từ form
    // Thêm dữ liệu vào model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // Get Data from the HTML form
        String theMessage = request.getParameter("studentName");

        // Convert the Data
        theMessage = theMessage.toUpperCase();

        // Create Message
        String result = "Yo! " + theMessage;

        // Return Result
        model.addAttribute("message", result);


        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShoutDudeVersionTow(@RequestParam("studentName") String theName, Model model){

        // Convert the Data
        theName = theName.toUpperCase();

        // Create Message
        String result = "Yo! " + theName;

        // Return Result
        model.addAttribute("message", result);


        return "helloworld";
    }



}
