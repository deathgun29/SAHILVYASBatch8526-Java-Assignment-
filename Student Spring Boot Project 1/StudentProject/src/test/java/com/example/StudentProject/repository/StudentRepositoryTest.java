package com.example.StudentProject.repository;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;


import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.StudentProject.student.Student;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepositoryTest {
	
	
	@Autowired
    private	 StudentRepo sp;
	
	
	
	
	
	
	@BeforeEach
	void setup()
	{
		Student stu=new Student(1,"Sahil","Eng");
		sp.save(stu);
		Student stu1=new Student(2,"Mehul","CS");
		sp.save(stu1);
	}
	@Rollback
	
	
	@Test
	void dataInsertionTest()
	{
		assertThat(sp.findAll()).size().isGreaterThan(0);
	}
	
	
	
	
	//find by name test
	@Test
	void findbyNameTest()
	{
	      String s="Sahil";
	      assertEquals("Sahil",sp.findBySnameIgnoreCase(s).getSname());
	}
	
	
	//Find by ID Test
	@Test
	void findbyIdTest()
	{
	      String s="Sahil";
	      Student str=sp.findById(1).get();
	      assertEquals(s,str.getSname());
	}
	
	
	//Update Student Test
	@Test
	void updateStudent()
	{
		Student s=sp.getById(1);
		s.setSubject("hindi");
		sp.save(s);
		assertEquals("hindi",sp.getById(1).getSubject());
	}
	
	
	//Delete Student Test
	@Test
	void deleteStudent()
	{
		Student s=sp.getById(1);
		sp.delete(s);
		Optional<Student> stulist=sp.findById(1);
		Student s1=null;
		if(stulist.isPresent())
		{
			s1=stulist.get();
		}
		assertThat(s1).isNull();
		
	}
	
	
 
}

