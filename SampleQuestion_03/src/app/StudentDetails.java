package app;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.io.Serializable;


import java.util.Date;
import java.time.LocalDate;

public class StudentDetails implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = -1217485442123865625L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = -7447493233000512784L;
	private int id;
	static int autoin;
	private String name;
	private Course courseName;
	private String course;
	private int age;
	private Date registrationdate;

	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	public StudentDetails(int id, String name , int age ,Date registrationdate, String course ) {
		super();
		this.id = id;
		id=++autoin;
		this.name = name;
		this.age = age;
		this.registrationdate = registrationdate;
		this.course = course;
	}


	public StudentDetails(int id, String name, Course courseName , int age) {
		super();
		this.id = id;
		id=++autoin;
		this.name = name;
		this.courseName=courseName;
		this.age = age;
	}
	
	public StudentDetails(String name, Course courseName , int age) {
		super();
		this.name = name;
		this.courseName=courseName;
		this.age = age;
	}
	
	public StudentDetails(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student Details [id=" + id + ", name=" + name + ",course name" + courseName + "Registration Date "+registrationdate+",age = " +  age + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Course getCourseName() {
		return courseName;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
