package com.anonfedora.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anonfedora.model.Employee;
import com.anonfedora.repository.EmployeeRepository;
import com.anonfedora.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(String id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public Employee updateEmployee(Employee employee, String id) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(RuntimeException::new);
        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setAge(employee.getAge());

        employeeRepository.save(employee);
        return existingEmployee;
    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepository.findById(id).orElseThrow(RuntimeException::new);
        employeeRepository.deleteById(id);
    }

}
