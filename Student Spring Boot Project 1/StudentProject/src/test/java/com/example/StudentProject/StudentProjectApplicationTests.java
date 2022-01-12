package com.example.StudentProject;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.StudentProject.exception.DataNotFound;
import com.example.StudentProject.exception.NameNotFound;
import com.example.StudentProject.repository.StudentRepo;
import com.example.StudentProject.student.*;


//Test using Mockito
@SpringBootTest
class StudentProjectApplicationTests {
	@Autowired
	private StudentService studentservice;
   
	@MockBean
	private StudentRepo studentrepo;
    
    @BeforeEach
    void fillStudent() throws DataNotFound
    {
    	Student student=Student.builder()
    			.sid(1)
    			.sname("Sahil")
    			.subject("Eng")
    			.build();
    	List<Student>s3= new ArrayList<>(Arrays.asList(student));
    	
    	Mockito.when(studentrepo.findBySnameIgnoreCase("Sahil")).thenReturn(student);
    	Mockito.when(studentrepo.findAll()).thenReturn((s3));

    			}
    

	@Test
 	void findByNameStudent() throws NameNotFound {
		
		String str="Sahil";
		Student s=studentservice.fetchbyName(str);
	
		assertEquals(str,s.getSname());
		
	}
	@Test
	void findallTest()
	{
		List<Student> stu=(List<Student>)studentrepo.findAll();
		assertThat(stu).size().isGreaterThan(0);
	}
	
	

}
