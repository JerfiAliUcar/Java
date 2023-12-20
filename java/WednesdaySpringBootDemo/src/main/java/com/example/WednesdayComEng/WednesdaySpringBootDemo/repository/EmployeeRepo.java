package com.example.WednesdayComEng.WednesdaySpringBootDemo.repository;

import com.example.WednesdayComEng.WednesdaySpringBootDemo.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,String > {

}
