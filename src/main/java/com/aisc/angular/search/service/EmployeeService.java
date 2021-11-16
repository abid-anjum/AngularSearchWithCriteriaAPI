package com.aisc.angular.search.service;

import org.springframework.data.domain.Page;

import com.aisc.angular.search.dto.EmployeeRequestDTO;
import com.aisc.angular.search.model.EmployeeProjectView;


public interface EmployeeService
{
	Page<EmployeeProjectView> findEmployeeProjectsBySpecification(EmployeeRequestDTO employeeRequestDTO);

	Page<EmployeeProjectView> findEmployeeProjectsExampleMatcher(EmployeeRequestDTO employeeRequestDTO);

	Page<EmployeeProjectView> findEmployeeProjectsByQuery(EmployeeRequestDTO employeeRequestDTO);
}
