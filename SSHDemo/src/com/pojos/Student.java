package com.pojos;

import java.util.Date;

/**
 * Student entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String sno;
	private String sname;
	private String ssex;
	private Date sbirthday;
	private String classname;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String sno, String sname, String ssex) {
		this.sno = sno;
		this.sname = sname;
		this.ssex = ssex;
	}

	/** full constructor */
	public Student(String sno, String sname, String ssex, Date sbirthday,
			String classname) {
		this.sno = sno;
		this.sname = sname;
		this.ssex = ssex;
		this.sbirthday = sbirthday;
		this.classname = classname;
	}

	// Property accessors

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSsex() {
		return this.ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public Date getSbirthday() {
		return this.sbirthday;
	}

	public void setSbirthday(Date sbirthday) {
		this.sbirthday = sbirthday;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

}