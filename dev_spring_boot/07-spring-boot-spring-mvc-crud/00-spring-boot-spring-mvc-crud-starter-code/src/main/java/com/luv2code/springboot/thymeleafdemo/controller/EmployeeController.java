package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController (EmployeeService service){
        employeeService = service;
    }

    // add mapping "/list"
    @GetMapping("/list")
    public String getList(Model theModel){

        // get employee from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to model
        theModel.addAttribute("employee", theEmployees);

        return "employees/list-employee";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){

        // New Employees
        Employee theEmployee = new Employee();

        // Add model
        theModel.addAttribute("employee", theEmployee);


        return "employees/employee-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){

        // get employee
        Employee theEmployee = employeeService.findById(theId);

        // add model
        theModel.addAttribute("employee", theEmployee);

        // return
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){

        //Save employee to db
        employeeService.save(theEmployee);

        // use a redirect to can't duplicate

        return "redirect:/employee/list";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int theId){

        // get employee
        employeeService.deleteById(theId);

        //return
        return "redirect:/employee/list";

    }








}
