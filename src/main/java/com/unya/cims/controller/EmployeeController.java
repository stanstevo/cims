package com.unya.cims.controller;

import com.unya.cims.entity.Employee;
import com.unya.cims.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

   /* @PostConstruct
    public void persistData() {
        employeeService.saveAll(Stream.of("stan muthee pj2321", "alice mwari pj4345", "sunjay popat pj7437", "kevin mwiti pj5462", "irene akinyi pj2322")
                .map(item -> {String[] items = item.split(" ");
                    Employee employee = new Employee();
                    employee.setFirstName(items[0]);
                    employee.setLastName(items[1]);
                    employee.setPjNumber(items[2]);
                    return  employee;
                }).collect(Collectors.toList())
        );
    }*/


}
