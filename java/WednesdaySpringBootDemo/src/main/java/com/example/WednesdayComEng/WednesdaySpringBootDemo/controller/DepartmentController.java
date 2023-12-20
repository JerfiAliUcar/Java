package com.example.WednesdayComEng.WednesdaySpringBootDemo.controller;

import com.example.WednesdayComEng.WednesdaySpringBootDemo.model.Department;
import com.example.WednesdayComEng.WednesdaySpringBootDemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/department")
    public class DepartmentController {

        @Qualifier("departmentServiceMemImp")
        @Autowired
        DepartmentService departmentService;

        @PostMapping
        public Department save(@RequestBody Department D){
            return departmentService.save(D);
        }

        @GetMapping("/{id}")
        public Department getDepById(@PathVariable(name="id") String id){
            return departmentService.getDepById(id);
        }

        @GetMapping
        public List<Department> getAllDepartments(){
            return departmentService.getAllDepartments();
        }


    }

