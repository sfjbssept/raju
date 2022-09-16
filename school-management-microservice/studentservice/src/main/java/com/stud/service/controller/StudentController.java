package com.stud.service.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stud.service.entity.Student;

@RestController
@RequestMapping("/getstudent")
public class StudentController {
	
	private static Map<String,List<Student>>  schoolDB= new HashMap<String,List<Student>>();
	
	static {
		 schoolDB= new HashMap<String,List<Student>>();
		 List<Student> list1 = new ArrayList<Student>();
		 Student s1=new Student("Raju","JNV");
		 Student s2=new Student("Riyansh","Kit");
		 Student s3=new Student("Ayandh","Nagaji");
		 Student s4=new Student("Saroj","Govent School");
		 
		 list1.add(s1);
		 list1.add(s2);
		 list1.add(s3);
		 list1.add(s4);
		 
		 List<Student> list2 = new ArrayList<Student>();
		 Student stu1=new Student("Sweety","XYZ");
		 Student stu2=new Student("Suryansh","Kendra");
		 Student stu3=new Student("Guriya","No school");
		 Student stu4=new Student("Pqr","rst");
		 
		 list2.add(stu1);
		 list2.add(stu2);
		 list2.add(stu3);
		 list2.add(stu4);
		 
		 schoolDB.put("School1", list1);
		 schoolDB.put("School2", list2);
		 
		
	}
	
	 @GetMapping("/forschool/{schoolname}") 
	 List<Student> getStudent(@PathVariable String schoolname){
		 List<Student> stulist= schoolDB.get(schoolname);
		if(stulist== null) {
			stulist = new ArrayList<Student>() ;
			Student student = new Student("Not found", "Na");
			stulist.add(student);
		}
		 return stulist;
	 }
	 

}
