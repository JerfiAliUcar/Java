package com.example.WednesdayComEng.WednesdaySpringBootDemo.controller;

import com.example.WednesdayComEng.WednesdaySpringBootDemo.model.Employee;
import com.example.WednesdayComEng.WednesdaySpringBootDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/employee")
public class EmployeeControllerV2 {
    @Qualifier("employeServiceH2Imp")
    @Autowired
    EmployeeService employeeService;

    @PostMapping()
    public Employee save(@RequestBody Employee E){
      return   employeeService.save(E);
    }

    @GetMapping()
     public List<Employee> listAllEmployee(){
        return  employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmplbyId(@PathVariable String id){
        return employeeService.getEmpById(id);
    }
}
