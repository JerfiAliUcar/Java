package com.example.WednesdayComEng.WednesdaySpringBootDemo.service;

import com.example.WednesdayComEng.WednesdaySpringBootDemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {

    public Employee save(Employee E);
    public Employee getEmpById(String id);

    public List<Employee> getAllEmployees();

    public String deleteEmployeeById(String id);


}
