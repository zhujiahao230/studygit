package com.rkjn.cms.service;

import java.util.List;

import com.rkjn.cms.entity.Student;

public interface StudentsService {
	
	void create(Student s);
	
	void delete(int id);
	
	void update(Student s);
	
	Student findById(int id);
	
	List<Student> getList(int pageSize,int pageNo);

}
