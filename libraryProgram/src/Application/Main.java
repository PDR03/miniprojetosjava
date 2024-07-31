package Application;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Entities.Livro;
import Entities.Usuario;
import Services.Aluguel;

public class Main {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		List <Usuario> listOfUsers = new ArrayList<>();
		List <Livro> listOfBooks = new ArrayList<>();
		
		int resposta = 0;
		do {
			System.out.println("Selecione a opção desejada: 1 Usuario|2 Bibliotecario");
			resposta = scr.nextInt();
			if(resposta == 1) {

				System.out.println("Digite seu ID de Usuario");
				int ID = scr.nextInt();
					System.out.println("1 Dados do usuario|2 Alugar um livro| 3 Ver livros alugados|0 Encerrar");
					resposta = scr.nextInt();
					if(resposta == 1) {
						System.out.println("Dados do usuario");
						for(Usuario usr : listOfUsers) {
							if(ID == usr.getID()) {
								System.out.print("Nome: " + usr.getName() + "\n");
								System.out.print("Idade " + usr.getAge()+ "\n");
								System.out.print("ID: " + usr.getID()+ "\n");
								
							}
						}
					}
					
					if(resposta == 2) {
						System.out.println("Livros disponiveis");
						int i = 0;
						for(Livro lvr : listOfBooks) {
							
							if(lvr.getStatus() == false) {
								System.out.println("Livro " + i);
								System.out.print("Titulo:" + lvr.getTitle() + "\n");
								System.out.print("Autor" + lvr.getAuthor() + "\n");
								System.out.print("Genero" + lvr.getGender() + "\n");
								i++;
							}
						}
						for(Usuario usr : listOfUsers) {
							if( ID == usr.getID()){
								Usuario user = listOfUsers.get();
							}
						}
						
						Aluguel aluguel = new Aluguel(LocalDateTime.now(), listOfBooks.get(i), user);
					}
				System.out.println("Livros alugados");
			
			}else if(resposta == 2) {
				
				
				System.out.println("Qual opção você deseja: 1 Registro de livros | 2 Cadastro de Usuarios| 0 Encerrar");
				resposta = scr.nextInt();
				if(resposta == 0) {
					break;
				}
				do{
					try {
					
					if(resposta == 1) {
						System.out.print("Titulo:");
						String title = scr.next();
					
						System.out.print("Autor:");
						String Author = scr.next();
					
						System.out.print("Numero de pags:");
						int numpag = scr.nextInt();
						
						System.out.print("Genero:");
						String gender = scr.next();
						
						listOfBooks.add(new Livro(title, Author, numpag, gender));
					}
					if(resposta == 2) {
						System.out.print("Digite seu nome:");
						String name = scr.next();
						
						System.out.print("Digite sua idade:");
						int age = scr.nextInt();
						
						System.out.println("Estamos registrando seu ID...");
						int ID = (int)(Math.random() * ((9999 - 1000) + 1)) + 1000;
						
						listOfUsers.add(new Usuario(name, age, ID));
					}
						if(resposta == 3 ) {
							System.out.println("1 Por genero| 2 Todos os livros");
							resposta = scr.nextInt();
							if(resposta == 1) {
								System.out.print("Qual o genero desejado?:");
								String genero = scr.next();
								for(Livro lvr : listOfBooks) {
									if(lvr.getGender().equalsIgnoreCase(genero)) {
										System.out.print("Titulo:" + lvr.getTitle() + "\n");
										System.out.print("Autor" + lvr.getAuthor()+ "\n");
										System.out.print("Genero" + lvr.getGender()+ "\n");
									}
								}
							}
						
							if(resposta == 2) {
								Collections.sort(listOfBooks);
								for(Livro lvr : listOfBooks) {
									System.out.print("Titulo:" + lvr.getTitle() + "\n");
									System.out.print("Autor" + lvr.getAuthor() + "\n");
									System.out.print("Genero" + lvr.getGender() + "\n");
								}  
							}
						}
						if(resposta == 4) {
							Collections.sort(listOfUsers);
							for(Usuario usr : listOfUsers) {
								System.out.print("Nome: " + usr.getName() + "\n");
								System.out.print("Idade " + usr.getAge()+ "\n");
								System.out.print("ID: " + usr.getID()+ "\n");
							}
						}
					
					System.out.println("Qual opção você deseja: 1 Registro de livros | 2 Cadastro de Usuarios| 3 Ver livros| 4 Ver usuarios| 0 Encerrar");
					resposta = scr.nextInt();
					
					}catch(InputMismatchException e) {
						System.out.println("Erro de entrada");
					}			
					}while(resposta != 0);
		}
		}while(resposta != 8);
		
		System.out.println("Fim de Programa!");
		
	}
}