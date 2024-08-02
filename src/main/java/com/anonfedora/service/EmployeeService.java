package com.anonfedora.service;

import java.util.List;
import com.anonfedora.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(String id);

    Employee updateEmployee(Employee employee, String id);

    void deleteEmployee(String id);
}
