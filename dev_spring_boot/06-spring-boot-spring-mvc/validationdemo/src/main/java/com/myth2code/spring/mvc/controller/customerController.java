package com.myth2code.spring.mvc.controller;

import com.myth2code.spring.mvc.model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class customerController {

    @RequestMapping("/")
    public String showForm(Model theModel){

        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("/processCustomer")
    public String processCustomer(
            @Valid @ModelAttribute("customer") Customer customer,
            BindingResult theBindingResult){

        if(theBindingResult.hasErrors()){
            return "customer-form";
        }else{
            return "processCustomer-form";
        }
    }


    // Loại bỏ khoảng trắng
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

}
