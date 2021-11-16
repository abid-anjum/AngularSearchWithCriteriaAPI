package com.aisc.angular.search.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aisc.angular.search.repository.ProjectRepository;


@Service
@Transactional
public class ProjectServiceImpl implements ProjectService
{
	private final ProjectRepository projectRepository;

	public ProjectServiceImpl(ProjectRepository projectRepository)
	{
		this.projectRepository = projectRepository;
	}
}
