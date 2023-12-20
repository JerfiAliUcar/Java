package com.example.WednesdayComEng.WednesdaySpringBootDemo.error;

import com.example.WednesdayComEng.WednesdaySpringBootDemo.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestErrorExceptions extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage theError() {
        ErrorMessage em = new ErrorMessage();
        em.setMessage("There something is not working ??? ");
        em.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        return em;
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage theEmployeeError(EmployeeNotFoundException ex) {
        ErrorMessage er = new ErrorMessage();
        er.setMessage(ex.getMessage());
        er.setStatus(HttpStatus.NOT_FOUND);
        return er;

    }


}
