package com.springjdbc.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sp.jdbc.dao.StudentDao;
import com.sp.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	// jdbctemplate object
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveStudent(Student student) {
		String query = "insert into student values ('" + student.getId() + "','" + student.getName() + "','"
				+ student.getMobile() + "','" + student.getEdu() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateStudent(Student student) {
		String query = "update student set education = '" + student.getEdu() + "' where Id = '" + student.getId()
				+ "' ";
		return jdbcTemplate.update(query);
	}

	public int deleteStudent(Student student) {
		String query = "delete from student  where id='" + student.getId() + "'";
		return jdbcTemplate.update(query);
	}
	
}