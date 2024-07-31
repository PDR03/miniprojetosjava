package Entities;

public class Livro implements Comparable<Livro>{
	private String Title;
	private String Author;
	private Integer numberPages;
	private String gender;
	private Boolean Status;
	
	//Constructors
	public Livro(String title, String author, Integer numberPages, String gender) {
		super();
		Title = title;
		Author = author;
		this.numberPages = numberPages;
		this.gender = gender;
		this.Status = false;
	}

	//Getters and Setters
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public Integer getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(Integer numberPages) {
		this.numberPages = numberPages;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean status) {
		Status = status;
	}
	
	@Override
	public int compareTo(Livro other) {
		return Title.compareTo(other.getTitle());
	}


	
	
}
