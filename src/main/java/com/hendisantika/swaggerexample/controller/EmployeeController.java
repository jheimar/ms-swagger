package com.hendisantika.swaggerexample.controller;

import com.hendisantika.swaggerexample.model.Employee;
import com.hendisantika.swaggerexample.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/5/17
 * Time: 9:59 AM
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @ApiOperation("value")
    @RequestMapping(method = RequestMethod.GET, value = "/employees/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Employee> employee(@PathVariable("id") int id) {
        Employee employee = service.findEmployee(id);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @ApiOperation("value")
    @RequestMapping(method = RequestMethod.GET, value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Iterable<Employee>> employees() {
        Iterable<Employee> employees = service.all();
        return new ResponseEntity<Iterable<Employee>>(employees, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employeess", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Employee> createProject(@RequestBody Employee emp) {
        Employee employee = service.save(emp);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employeess", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Employee> updateProject(@RequestBody Employee emp) {
        Employee employee = service.save(emp);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employeess", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Boolean> deleteProject(@RequestBody Employee emp) {
        service.delete(emp);
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }
}
