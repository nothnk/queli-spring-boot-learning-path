package com.queli.crudsample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.queli.crudsample.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}