package com.daobao.spring.democrud.rest;

import com.daobao.spring.democrud.entity.Employee;
import com.daobao.spring.democrud.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService service){
        employeeService = service;
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){

      return employeeService.findAll();
    }

    // add GET mapping "/employee/{employeeId}" - find Employee

    @GetMapping("/employee/{employeeId}")
    public Employee findEmployeeById(@PathVariable int employeeId){

        Employee employee = employeeService.findById(employeeId);

        if(employee == null){
            throw new RuntimeException("Employee Id Not Found - " + employeeId);
        }

        return employee;
    }

    // add POST mapping "/employee" - add new Employee

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){

        // id = 0 ==> save
        // id != 0 ==> update

        employee.setId(0);

        Employee dbEmployee = employeeService.save(employee);

        return dbEmployee;
    }

    // add mapping PUT "/employee" - update existing employee

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){

        Employee dbEmployee = employeeService.save(employee);

        return dbEmployee;
    }

    @DeleteMapping("/employee/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){

        // get Employee
        Employee employee = employeeService.findById(employeeId);

        if(employee == null){
            throw new RuntimeException("Employee Id Not Found - " + employeeId);
        }

        employeeService.deleteById(employeeId);

        return "Deleted Employee Id - " + employeeId; 
    }


}
