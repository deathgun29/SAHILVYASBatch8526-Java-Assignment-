package com.example.StudentProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.StudentProject.exception.DataNotFound;
import com.example.StudentProject.exception.NameNotFound;
import com.example.StudentProject.student.Student;

import com.example.StudentProject.student.StudentServiceInterface;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceInterface studentserviceinterface;
	
	//Get all student Data
	@GetMapping("/students")
	public List<Student> getallStudent()
	{
		return studentserviceinterface.getallStudents();
	}
	
	//Get data by ID, also throws error if "ID" not found
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable Integer id ) throws DataNotFound
	{
		return studentserviceinterface.getStudent(id);
	}
	
	
	
	//Add Student Data
	@PostMapping("/students")
	public String addStudent(@RequestBody Student student)
	{
		
		studentserviceinterface.addStudent(student);
		 return "Added Successfully!";
	}
	
	
	//Update Student Data
	@PutMapping("/students/{id}")
	public String updateStudent(@PathVariable Integer id,@RequestBody Student student)
	{
		studentserviceinterface.updateStudent(id,student);
		return "Updated Successfully!";
	}
	
	
	//Delete a Student data
	@DeleteMapping("/students/{id}")
	public String deleteStudent(@PathVariable Integer id)
	{
		studentserviceinterface.deleteStudent(id);
		return "Deleted Successfully!";
	}

	
	//Get Student by name also throws error if "Name" not found
	@GetMapping("/students/name/{name}")
	public Student fetchbyName(@PathVariable("name") String studentname) throws NameNotFound
	{
		return studentserviceinterface.fetchbyName(studentname);
	}

}
