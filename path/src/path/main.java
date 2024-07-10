package path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\labfa\\test\\doc.csv";
		String arquivo = "c:\\Users\\labfa\\test\\arquivo.csv";
		try(BufferedReader buff  = new BufferedReader(new FileReader(path)); BufferedWriter br = new BufferedWriter(new FileWriter(arquivo))) {
			String line = buff.readLine();
			
			 while (line != null) {
	               
	                String[] campos = line.split(",");
	                
	                if(campos.length >= 3) {
	                	try {
	                		 String nome = campos[0];
	                		 double preco = Double.parseDouble(campos[campos.length - 2].trim());
	                         int quantidade = Integer.parseInt(campos[campos.length - 1].trim());
	                         
	                         double valorTotal = preco * quantidade;
	                         
	                         
	     	                	br.write(nome + valorTotal);
	     	                	br.newLine();
	     	                 }catch(IOException e) {
	     	                	 System.out.println("Deu erro no buffer" + e.getMessage());  
	                	     }catch(NumberFormatException e){
	                	    	 System.out.println("Erro:" + e.getMessage());
	                	}
	                }  
	                line = buff.readLine(); 
	            }
		}catch(IOException e){
			System.out.println("Deu b.o" + e.getMessage());
			
			
		}
		
	}	

}
