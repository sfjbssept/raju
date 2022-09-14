package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.crud.entity.Student;
import com.crud.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
	}

	
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}


	public Optional<Student> getStudent(Integer id) {
		return studentRepository.findById(id);
	}


	public Student updateStudent(Integer id,Student studentui) {
		Student extingStudent=studentRepository.findById(id).get();
		extingStudent.setCity(studentui.getCity());
		extingStudent.setCollege(studentui.getCollege());
		extingStudent.setName(studentui.getName());
		extingStudent.setId(studentui.getId());
		studentRepository.save(extingStudent);
		return extingStudent;
	}
	
	public void delete(Integer id) {
		studentRepository.deleteById(id);
	}
}
