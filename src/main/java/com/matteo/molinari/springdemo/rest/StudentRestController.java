package com.matteo.molinari.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matteo.molinari.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> students;
	
	@PostConstruct
	public void loadData() {
		students = new ArrayList();
		
		students.add(new Student("Andreas", "Nefzger"));
		students.add(new Student("Warren", "Heffernan"));
		students.add(new Student("Sebastian", "Pirpidel"));
	}

	@GetMapping("/students")
	public List<Student> getStudents(){
		return students;
	}
	
	@GetMapping("students/{id}")
	public Student getStudent(@PathVariable int id) {
		return students.get(id);
	}
	
}
