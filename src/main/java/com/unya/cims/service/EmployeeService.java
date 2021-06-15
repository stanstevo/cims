package com.unya.cims.service;

import com.unya.cims.entity.Employee;
import com.unya.cims.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public void saveAll(List<Employee> employees) {
        employeeRepository.saveAll(employees);
    }
}
