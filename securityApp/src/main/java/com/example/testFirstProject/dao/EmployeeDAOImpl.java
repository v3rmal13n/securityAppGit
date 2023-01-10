package com.example.testFirstProject.dao;

import com.example.testFirstProject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        Query query = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();
        return allEmployees;
    }
}
