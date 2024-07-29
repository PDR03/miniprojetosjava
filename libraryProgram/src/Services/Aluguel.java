package Services;

import java.time.LocalDateTime;

import Entities.Livro;

public class Aluguel {
	private LocalDateTime retirada;
	private LocalDateTime retorno;
	Livro livro;
	Tax tax;
	
	//Constructors
	public Aluguel(LocalDateTime retirada, LocalDateTime retorno, Livro livro, Tax tax) {
		this.retirada = retirada;
		this.retorno = retorno;
		this.livro = livro;
		this.tax = tax;
	}
	
	//Getters and Setters
	public LocalDateTime getRetirada() {
		return retirada;
	}
	
	public void setRetirada(LocalDateTime retirada) {
		this.retirada = retirada;
	}
	public LocalDateTime getRetorno() {
		return retorno;
	}
	public void setRetorno(LocalDateTime retorno) {
		this.retorno = retorno;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Tax getTax() {
		return tax;
	}
	public void setTax(Tax tax) {
		this.tax = tax;
	}
}
