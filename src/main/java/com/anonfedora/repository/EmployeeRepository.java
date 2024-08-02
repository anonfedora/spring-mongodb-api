package com.anonfedora.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anonfedora.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
