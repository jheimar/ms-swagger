package com.hendisantika.swaggerexample.service;

import com.hendisantika.swaggerexample.model.Employee;
import com.hendisantika.swaggerexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/5/17
 * Time: 7:50 AM
 * To change this template use File | Settings | File Templates.
 */

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Iterable<Employee> all() {
        return repository.findAll();
    }

    public Employee findEmployee(Long id) {
        return repository.findOne(id);
    }

    public Employee save(Employee employee) {

        return repository.save(employee);
    }

    public void delete(Employee employee) {
        repository.delete(employee);
    }
}
