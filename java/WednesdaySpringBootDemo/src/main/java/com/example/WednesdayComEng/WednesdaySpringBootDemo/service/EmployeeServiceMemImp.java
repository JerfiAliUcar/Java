package com.example.WednesdayComEng.WednesdaySpringBootDemo.service;

import com.example.WednesdayComEng.WednesdaySpringBootDemo.error.EmployeeNotFoundException;
import com.example.WednesdayComEng.WednesdaySpringBootDemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceMemImp implements EmployeeService {
    List<Employee> empList= new ArrayList<>();


    @Override
    public Employee save(Employee E) {
        if (E.getId() == null)
            E.setId(UUID.randomUUID().toString());
       empList.add(E);
        return E;
    }

    @Override
    public Employee getEmpById(String id) {
        Employee E= empList
                .stream()
                .filter(t->t.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow( ()->new EmployeeNotFoundException("Employee Not Found"));
            return E ;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empList;
    }

    @Override
    public String deleteEmployeeById(String id) {
        return null;
    }
}
