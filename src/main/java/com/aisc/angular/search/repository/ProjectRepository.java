package com.aisc.angular.search.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aisc.angular.search.model.Project;


public interface ProjectRepository extends JpaRepository<Project,Long>
{
}

