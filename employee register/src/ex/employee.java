package ex;

public class employee {
	private String name;
	private Integer hour;
	private Double valuePerHour;
	
	//Constructo
	public employee(String name, Integer hour, Double valuePerHour) {
		super();
		this.name = name;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
		
		
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	//methods
	
	public double payment() {
		return hour * valuePerHour;
	}
}
