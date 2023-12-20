package com.example.WednesdayComEng.WednesdaySpringBootDemo.error;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
