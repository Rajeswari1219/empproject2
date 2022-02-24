package com.raji.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raji.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
