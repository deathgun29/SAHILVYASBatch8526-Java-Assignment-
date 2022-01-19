package com.example.BookProject.Book;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.BookProject.Department.Department;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
	
	@Id
	private int book_id;
	private String book_name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="department_id",referencedColumnName = "department_id")
	private Department department;
	
	public void setDepartmentToBook(Department department)
	{
		this.department=department;
	}

}
