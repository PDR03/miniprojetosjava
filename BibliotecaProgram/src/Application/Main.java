package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Livro;
import Entities.Usuario;

public class Main {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		List <Usuario> listOfUsers = new ArrayList<>();
		List <Livro> listOfBooks = new ArrayList<>();
		
		int resposta = 0;
		System.out.println("Qual opção você deseja: 1 Registro de livos | 2 Cadastro de Usuarios| 0 Encerrar");
		resposta = scr.nextInt();
		do{
			
			if(resposta == 1) {
				System.out.print("Titulo:");
				String title = scr.next();
				
				System.out.print("Autor:");
				String Author = scr.next();
				
				System.out.print("Numero de pags:");
				int numpag = scr.nextInt();
				
				System.out.println("Genero");
				String generous = scr.next();
				
				listOfBooks.add(new Livro(title, Author, numpag, generous));
			}
			if(resposta == 2) {
				System.out.print("Digite seu nome:");
				String name = scr.next();
				
				System.out.print("Digite sua idade:");
				int age = scr.nextInt();
				
				System.out.println("Estamos registrando seu ID...");
				int ID = (int) (Math.random() * 10000);
				
				listOfUsers.add(new Usuario(name, age, ID));
									
				if(resposta == 3 ) {
					System.out.println("1 Por genero| 2 Todos os livros");
					resposta = scr.nextInt();
					if(resposta == 1) {
						System.out.print("Qual o genero desejado?:");
						String genero = scr.next();
						for(Livro lvr : listOfBooks) {
							if(lvr.getGenerous().equalsIgnoreCase(genero)) {
								System.out.print("Titulo:" + lvr.getTitle());
								System.out.print("Autor" + lvr.getAuthor());
								System.out.print("Genero" + lvr.getGenerous());
							}
						}
					}
					
					
					if(resposta == 2) {
						for(Livro lvr : listOfBooks) {
							System.out.print("Titulo:" + lvr.getTitle());
							System.out.print("Autor" + lvr.getAuthor());
							System.out.print("Genero" + lvr.getGenerous());
						}
					}
				}
				if(resposta == 3) {
					for(Usuario usr : listOfUsers) {
						System.out.println(usr.getName());
						System.out.println(usr.getAge());
						System.out.println(usr.getID());
					}
				}
			}
			System.out.println("Qual opção você deseja: 1 Registro de livos | 2 Cadastro de Usuarios| 3 Ver livros| 4 Ver usuarios| 0 Encerrar");
			resposta = scr.nextInt();
		}while(resposta != 0);
		
		
		
	}

}
