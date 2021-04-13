package com.stefan.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    EmployeeService(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    List<Employee> getAll(){
        var l = new ArrayList<Employee>();
        for(Employee r : employeeRepository.findAll())
        {
            l.add(r);
        }
        return l;
    }

    Employee get(Integer id){
        return employeeRepository.findById(id).get();
    }

    
    
}
