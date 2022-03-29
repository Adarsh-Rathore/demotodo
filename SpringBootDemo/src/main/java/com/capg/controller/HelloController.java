package com.capg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.model.Student;

@RestController
public class HelloController {
	@GetMapping("/getStudent")
	public Student getStudent() {
		Student stu = new Student();
		stu.setStid(200);
		stu.setStname("Adarsh rathore");
		return stu;
	}
}
