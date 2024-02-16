package com.daobao.spring.democrud.dao;

import com.daobao.spring.democrud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    // define field for entitymanager
    private EntityManager theEntityManager;

    // set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager){
        theEntityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        // create query
        TypedQuery<Employee> query = theEntityManager.createQuery("FROM Employee ", Employee.class);

        // excute query and get resutl list
        List<Employee> employees = query.getResultList();

        //return the resutl
        return employees;
    }

    @Override
    public Employee findById(int theId) {

        // get Employee
        Employee employee = theEntityManager.find(Employee.class, theId);

        // return Employee
        return employee;
    }

    @Override
    public Employee save(Employee employee) {

        Employee dbEmployee = theEntityManager.merge(employee);

        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {

        // find Employee
        Employee employee = theEntityManager.find(Employee.class, theId);

        // remove Employee
        theEntityManager.remove(employee);

    }
}
