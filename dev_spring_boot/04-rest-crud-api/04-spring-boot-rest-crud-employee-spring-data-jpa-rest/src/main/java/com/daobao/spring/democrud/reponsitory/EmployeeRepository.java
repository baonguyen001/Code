package com.daobao.spring.democrud.reponsitory;

import com.daobao.spring.democrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // That's it ... no need write any code LOL!

}
