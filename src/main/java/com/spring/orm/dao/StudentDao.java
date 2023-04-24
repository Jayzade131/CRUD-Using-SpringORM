package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernatetemplate;
	 	

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}


	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}


	// INSERT
	@Transactional
	public int insert(Student student) {

		int i = (Integer) this.hibernatetemplate.save(student);
		return i;
	}

}
