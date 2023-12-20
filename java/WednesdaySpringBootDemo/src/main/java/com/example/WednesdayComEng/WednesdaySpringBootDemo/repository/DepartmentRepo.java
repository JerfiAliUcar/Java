package com.example.WednesdayComEng.WednesdaySpringBootDemo.repository;

import com.example.WednesdayComEng.WednesdaySpringBootDemo.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentEntity,String> {

}
