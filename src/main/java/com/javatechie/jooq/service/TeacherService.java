package com.javatechie.jooq.service;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tej.JooQDemo.jooq.sample.model.Tables;
import com.tej.JooQDemo.jooq.sample.model.tables.pojos.Teachers;

@Service
public class TeacherService {
	
	@Autowired
	private DSLContext dslContext;
	
	public void insertTeacher(Teachers teachers) {
		dslContext.insertInto(Tables.TEACHERS, Tables.TEACHERS.ID,Tables.TEACHERS.NAME, 
				Tables.TEACHERS.BIRTHDAY,Tables.TEACHERS.AGE, Tables.TEACHERS.ADDRESS)
				.values(teachers.getId(), teachers.getName(), teachers.getBirthday(),
						teachers.getAge(), teachers.getAddress()).execute();
	}
	public List<Teachers> getTeachers(){
		return dslContext.selectFrom(Tables.TEACHERS)
				.fetchInto(Teachers.class);
	}
}
