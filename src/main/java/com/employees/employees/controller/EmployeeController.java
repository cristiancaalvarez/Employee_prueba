package com.employees.employees.controller;

import com.employees.employees.model.Employee;
import com.employees.employees.service.impl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/employee")
public class EmployeeController extends GeneralControllerImpl<Employee, EmployeeServiceImpl> {
}
