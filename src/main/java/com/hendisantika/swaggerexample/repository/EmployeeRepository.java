package com.hendisantika.swaggerexample.repository;

import com.hendisantika.swaggerexample.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/5/17
 * Time: 7:49 AM
 * To change this template use File | Settings | File Templates.
 */

@RepositoryRestResource
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
}
