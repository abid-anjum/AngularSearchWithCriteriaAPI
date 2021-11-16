package com.aisc.angular.search.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aisc.angular.search.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}
