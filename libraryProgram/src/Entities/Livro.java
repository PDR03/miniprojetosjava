package Entities;

public class Livro implements Comparable<Livro>{
	private String Title;
	private String Author;
	private Integer numberPages;
	private String generous;
	
	//Constructors
	public Livro(String title, String author, Integer numberPages, String generous) {
		super();
		Title = title;
		Author = author;
		this.numberPages = numberPages;
		this.generous = generous;
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

	public String getGenerous() {
		return generous;
	}

	public void setGenerous(String generous) {
		this.generous = generous;
	}

	@Override
	public int compareTo(Livro other) {
		return Title.compareTo(other.getTitle());
	}
	
	
}
