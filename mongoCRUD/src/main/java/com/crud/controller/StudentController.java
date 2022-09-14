package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/add")
	ResponseEntity<Student> addStudent(@RequestBody Student student) {
		 
			Student student2=	studentService.addStudent(student);
			return ResponseEntity.ok(student2);
	}

	
	    @GetMapping("/allstudent")
		ResponseEntity<List<Student>> getAllStudent(){
			List<Student> students=studentService.getAllStudent();
			return ResponseEntity.ok(students);
		}
	
	    
	    @GetMapping("/getstudent/{id}")
	    ResponseEntity<Optional<Student>> getStudent(@PathVariable Integer id){
	    	Optional<Student> student = studentService.getStudent(id);
	    	return ResponseEntity.ok(student);
	    }
	    
	    @PutMapping("/update/{id}")
	    ResponseEntity<Student> updatestudent(@PathVariable Integer id, @RequestBody Student studentui){
	    	Student student =studentService.updateStudent(id,studentui);
	    	return ResponseEntity.ok(student);
	    }
	    
	    
	    @DeleteMapping("/deletestudent/{id}")
	    void deleteStudent(@PathVariable Integer id){
	    	studentService.delete(id);
	    }
}
