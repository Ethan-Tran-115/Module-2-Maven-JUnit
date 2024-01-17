package model;

/**
 * @author Phuoc Tran - ptran9@dmacc.edu
 * CIS175 - Spring 2024
 * Jan 16, 2024
 */
public class Student {
	private String name;
	private int grade;
	
	//Default no-arg constructor
	public Student() {
		super();
	}
	
	// Constructor with parameters
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	
	//Getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
