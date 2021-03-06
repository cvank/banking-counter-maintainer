package com.counter.maintainer.service;

import com.counter.maintainer.data.contracts.EmployeeRole;
import com.counter.maintainer.exceptions.InvalidEmployeeException;
import com.counter.maintainer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeRole getEmployeeRole(Long empId) {
        if(empId<=0) {
            throw new InvalidEmployeeException("Provided empId:"+ empId+ " not valid");
        }
        return employeeRepository.getEmployeeRole(empId);
    }
}
