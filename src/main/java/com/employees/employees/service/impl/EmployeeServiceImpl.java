package com.employees.employees.service.impl;

import com.employees.employees.model.Employee;
import com.employees.employees.repository.IGeneralRepository;
import com.employees.employees.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends GeneralServiceImpl<Employee, Integer> implements IEmployeeService {

    @Autowired
    private IEmployeeService employeeRepo;

    public EmployeeServiceImpl(IGeneralRepository<Employee, Integer> generalRepository) {
        super(generalRepository);
    }
}
