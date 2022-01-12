package com.example.StudentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.StudentProject.student.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{
	//To find Student using Name (Ignore case)
	public Student findBySnameIgnoreCase(String studentname);

}
