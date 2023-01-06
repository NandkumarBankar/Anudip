package com.sp.jdbc.dao;

import com.sp.jdbc.entity.Student;

public interface StudentDao {
	
	public int saveStudent(Student student);

	public int updateStudent(Student student);

	public int deleteStudent(Student student);
	
}