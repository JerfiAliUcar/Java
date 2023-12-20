package com.example.WednesdayComEng.WednesdaySpringBootDemo.service;

import com.example.WednesdayComEng.WednesdaySpringBootDemo.model.Department;
import com.example.WednesdayComEng.WednesdaySpringBootDemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    public Department save(Department D);

    public Department getDepById(String id);

    public List<Department> getEmpById(String id);

    public List<Department> getAllDepartments();

    public String deleteDepartmentById(String id);

}
