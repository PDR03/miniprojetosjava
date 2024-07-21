package Entities;

public class Usuario {
	private String name;
	private Integer age;
	private String ID;
	
	//Constructor
	public Usuario(String name, Integer age, String iD) {
		this.name = name;
		this.age = age;
		ID = iD;
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

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
}
