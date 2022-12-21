package com.javatechie.jooq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.jooq.service.TeacherService;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Teachers;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping
	public Teachers addTeacher(@RequestBody Teachers teachers) {
		teacherService.insertTeacher(teachers);
		return teachers;
	}
	@GetMapping
	public List<Teachers> getList(){
		return teacherService.getTeachers();
	}
	
}
