package com.example.WednesdayComEng.WednesdaySpringBootDemo.controller;

import com.example.WednesdayComEng.WednesdaySpringBootDemo.model.Employee;
import com.example.WednesdayComEng.WednesdaySpringBootDemo.service.EmployeeService;
import com.example.WednesdayComEng.WednesdaySpringBootDemo.service.EmployeeServiceMemImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Qualifier("employeeServiceMemImp")
    @Autowired
    EmployeeService employeeService;

    @PostMapping()
    public Employee save(@RequestBody Employee E) {
        return employeeService.save(E);
    }

    @GetMapping("/{id}")
    public Employee getEmpById(@PathVariable(name = "id") String id) {
        return employeeService.getEmpById(id);
    }

    @GetMapping
    public List<Employee> getAllEmpl(){
        return employeeService.getAllEmployees();
    }


}
