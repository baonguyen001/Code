package com.myth2code.springboot.thymeleafdemo.controller;

import com.myth2code.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/showStudentForm")
    public String showForm(Model model){

        // Create student object
        Student theStudent = new Student();

        // Add student object to model
        model.addAttribute("student", theStudent);

        return "student-form";
    }

    @RequestMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent ){

        // Log the input data
        System.out.println("TheStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

        return "student-confirmation";
    }

}
