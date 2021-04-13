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
    private EmployeeRepository employeeRepository;

    @GetMapping(path="/")
    @CrossOrigin()
    String empty()
    {
        return "jepp";
    }



    @GetMapping(path="/employee")
    @CrossOrigin()
    List<Employee> getAll(){
        var l = new ArrayList<Employee>();
        for(Employee r : employeeRepository.findAll())
        {
            l.add(r);
        }
        return l;
    }

    @GetMapping(path="/player/{id}")
    @CrossOrigin()
    Employee getSingle(@PathVariable Integer id){
        return employeeRepository.findById(id).get();    
    }

    
}
