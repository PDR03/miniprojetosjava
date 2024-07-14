package entities;

import java.util.Date;

public class HourlyeEmployee extends Employee {
	
	private Double valuePerHour;
	private Integer workedHours;
	
	//Constructor
	
	public HourlyeEmployee(String name, Integer age, Date hiringDate, Double salary, Double valuePerHor,
			Integer workedHours) {
		super(name, age, hiringDate, salary);
		this.valuePerHour = valuePerHor;
		this.workedHours = workedHours;
		this.setSalary(valuePerHour * workedHours);
	}

	//Getters and Setters
	
	public Double getValuePerHor() {
		return valuePerHour;
	}

	public void setValuePerHor(Double valuePerHor) {
		this.valuePerHour = valuePerHor;
	}

	public Integer getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(Integer workedHours) {
		this.workedHours = workedHours;
	}
	
	
	//Methods
}
