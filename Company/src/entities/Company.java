package entities;

public class Company {
	private String employeeName;

	
	//Constructor
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	//Getters and Setters
	public Company(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}
}
