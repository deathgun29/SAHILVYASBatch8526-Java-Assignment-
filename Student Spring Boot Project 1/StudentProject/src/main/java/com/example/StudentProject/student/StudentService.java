package com.example.StudentProject.student;


import java.util.ArrayList;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentProject.exception.DataNotFound;
import com.example.StudentProject.exception.NameNotFound;
import com.example.StudentProject.repository.StudentRepo;

@Service
public class StudentService implements StudentServiceInterface  
{
	@Autowired
	private StudentRepo studentrepo;
	
	
	//Logic for List of all students
	@Override
	public List<Student> getallStudents()
	{
		System.out.println("I am IN");
		List<Student> studentdata=new ArrayList<>();
		studentrepo.findAll().forEach(studentdata::add);
		
		return studentdata;
	}
	
	
	
	//Logic for getting data using only ID
	@Override
	public Student getStudent(Integer id) throws DataNotFound 
	{
		
		Optional<Student> student= studentrepo.findById(id);
		System.out.println(student);
		
		if(!student.isPresent())
		{
			throw new DataNotFound("No student with Id no."+id+" exist");
		}
		
	  return student.get();
	}
	
	
	//Logic for adding student data
	@Override
	public Student addStudent(Student student)
	{
		return studentrepo.save(student);
	}
	
	
	
	//Logic for updating student data
	@Override
	public void updateStudent(Integer id,Student student)
	{
		studentrepo.save(student);
	}
	
	
	//Logic for Deleting student data
	@Override
	public void deleteStudent(Integer id)
	{
		studentrepo.deleteById(id);
	}
	
	
	
	//Logic for fetching student data using name
	@Override
	public Student fetchbyName(String studentname) throws NameNotFound
	{
		Student s=studentrepo.findBySnameIgnoreCase(studentname);
	    
	    if(s==null)
	    {
	    	throw new NameNotFound("No student exist with name "+studentname);
	    }
		return s;
	}

}
