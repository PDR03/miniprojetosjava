package Entities;

public class Usuario implements Comparable<Usuario> {
	private String name;
	private Integer age;
	private Integer ID;
	
	//Constructor
	public Usuario(String name, Integer age, Integer iD) {
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

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	@Override
	public int compareTo(Usuario other) {
		
		return name.compareTo(other.getName());
	}
}
