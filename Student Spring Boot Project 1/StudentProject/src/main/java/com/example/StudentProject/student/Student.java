package com.example.StudentProject.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Builder;
import lombok.*;
import lombok.Data;




@Entity
//Lombok annotations:👇
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    
	@Id
	private int sid;
	private String sname;
	private String subject;

}
