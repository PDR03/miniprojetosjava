package entities;

import java.util.Date;

public class Employee {
	
	private String name;
	private Integer age;
	private Date hiringDate;
	private Double salary = 0.0;
	//Constructor
	public Employee(String name, Integer age, Date hiringDate) {
		this.name = name;
		this.age = age;
		this.hiringDate = hiringDate;
		
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(Date hiringDate) {
		this.hiringDate = hiringDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	//Methods
	
	
}
