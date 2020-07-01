package com.matteo.molinari.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matteo.molinari.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList();
		
		students.add(new Student("Andreas", "Nefzger"));
		students.add(new Student("Warren", "Heffernan"));
		students.add(new Student("Sebastian", "Pirpidel"));
		
		return students;
	}
	
}
