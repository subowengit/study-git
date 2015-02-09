package com.servicesimpl;

import java.util.List;

import com.dao.StudentDAO;
import com.iservices.IStudentServices;
import com.pojos.Student;

public class StudentServicesimpl implements IStudentServices {
	StudentDAO studentDAO;
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	/**
	 * 查询所有的学生
	 */
	public List<Student> queryList() {
		return studentDAO.findAll();
	}

}
