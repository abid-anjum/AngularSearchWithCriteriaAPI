package com.aisc.angular.search.dto;


import lombok.Data;

@Data
public class EmployeeRequestDTO
{
	private Long employeeId;
	private Integer currentPageNumber = 0;
	private Integer pageSize = 20;
	private String sortColumnName = "lastName";
	private String sortDirection = "desc";
	private String filterText;
}