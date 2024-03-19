package com.myth2code.springboot.thymeleafdemo.controller;

import com.myth2code.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${language}")
    private List<String> language;

    @Value("${system}")
    private List<String> system;


    @RequestMapping("/showStudentForm")
    public String showForm(Model model){

        // Create student object
        Student theStudent = new Student();

        // Add student object to model
        model.addAttribute("student", theStudent);

        // Add list the countries to model
        model.addAttribute("countries", countries);

        // Add list the favorite language to model
        model.addAttribute("language", language);

        // Add list the favorite system to model
        model.addAttribute("system", system);


        return "student-form";
    }

    @RequestMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent ){

        // Log the input data
        //System.out.println("TheStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

        return "student-confirmation";
    }

}
