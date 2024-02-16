package com.daobao.spring.democrud.reponsitory;

import com.daobao.spring.democrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // That's it ... no need write any code LOL!

}
