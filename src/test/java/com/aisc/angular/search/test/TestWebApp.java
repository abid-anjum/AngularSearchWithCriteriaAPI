package com.aisc.angular.search.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.Console;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import com.aisc.angular.search.model.Project;
import com.aisc.angular.search.repository.ProjectRepository;


public class TestWebApp extends ApplicationTests {
	@Autowired
    private ProjectRepository projectRepository;    
    private Project project = new Project();
    
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    @BeforeAll
    public static void init(){
        System.out.println("BeforeAll init() method called");
    }

    @BeforeEach
    public void initEach(){
        System.out.println("BeforeEach initEach() method called");
    }
    
    @Test
    public void create() {    	
    	try
	    	{
            LOGGER.error("Start Insert new row in project table");
            
			/*
			 * project.setId(7l); project.setName("ABC"); project.setLocation("Riyadh");
			 * projectRepository.save(project);
			 */
	    	
	        //assertEquals(project.getCreatedBy(),"Mr. Abid"); 
    	}
    	catch (Exception ex)
    	{
    		throw ex;
    	}         
    }
}
