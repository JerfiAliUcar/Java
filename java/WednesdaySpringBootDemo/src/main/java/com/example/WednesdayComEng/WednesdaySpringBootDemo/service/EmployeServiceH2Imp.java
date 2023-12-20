package com.example.WednesdayComEng.WednesdaySpringBootDemo.service;

import com.example.WednesdayComEng.WednesdaySpringBootDemo.entity.EmployeeEntity;
import com.example.WednesdayComEng.WednesdaySpringBootDemo.model.Employee;
import com.example.WednesdayComEng.WednesdaySpringBootDemo.repository.EmployeeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeServiceH2Imp implements  EmployeeService{
    @Autowired
    EmployeeRepo employeeRepository;

    @Override
    public Employee save(Employee E) {
        EmployeeEntity empEntity= new EmployeeEntity();
           if(E.getId()==null)
               E.setId(UUID.randomUUID().toString());
        BeanUtils.copyProperties(E,empEntity);
        employeeRepository.save(empEntity);

    return E;
    }

    @Override
    public Employee getEmpById(String id) {
        Employee emp= new Employee();
       EmployeeEntity empEnti= employeeRepository.findById(id).get();
       BeanUtils.copyProperties(empEnti,emp);
        return emp;
    }

    @Override
    public List<Employee> getAllEmployees() {
       List<EmployeeEntity> empEntlist= employeeRepository.findAll();
       List<Employee> empModList= new ArrayList<>();

       for(EmployeeEntity emEn:empEntlist)
       {
           Employee Emp= new Employee();
           BeanUtils.copyProperties(emEn,Emp);
           empModList.add(Emp);

       }

        return empModList;
    }

    @Override
    public String deleteEmployeeById(String id) {
        return null;
    }
}
