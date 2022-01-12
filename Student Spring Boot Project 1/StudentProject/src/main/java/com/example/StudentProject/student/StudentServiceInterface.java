package com.example.StudentProject.student;

import java.util.List;

import com.example.StudentProject.exception.DataNotFound;
import com.example.StudentProject.exception.NameNotFound;

public interface StudentServiceInterface {
	public List<Student> getallStudents();
	public Student getStudent(Integer id) throws DataNotFound;
	public Student addStudent(Student student);
	public void updateStudent(Integer id,Student student);
	public void deleteStudent(Integer id);
	public Student fetchbyName(String studentname) throws NameNotFound;

}
