package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	 	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	// INSERT
	@Transactional
	public int insert(Student student) {

		int i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	//READ
	public Student showStudent(int id)
	{	
		Student student=this.hibernateTemplate.get(Student.class, id);
		return student;
		
	}
	
	//READ ALL
	public List<Student> showAllStudent()
	{
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	
	//Delete
	@Transactional
	public void deleteStudent(int id)
	{
		Student studentDel=this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(studentDel);
	}
	//update
	@Transactional

	public void UpdateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}

	

}
