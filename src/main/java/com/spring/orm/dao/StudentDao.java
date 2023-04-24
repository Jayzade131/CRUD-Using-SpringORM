package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernatetemplate;

	// INSERT
	public int insert(Student student) {

		int i = (Integer) this.hibernatetemplate.save(student);
		return i;
	}

}
