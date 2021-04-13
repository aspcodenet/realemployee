package com.stefan.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path="/")
    @CrossOrigin()
    String empty()
    {
        return "jepp";
    }



    @GetMapping(path="/employee")
    @CrossOrigin()
    List<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping(path="/employee/{id}")
    @CrossOrigin()
    Employee getSingle(@PathVariable Integer id){
        return employeeService.get(id);
    }

    
}
