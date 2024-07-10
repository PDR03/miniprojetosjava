package path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fds {

    public static void main(String[] args) {
        
        String path = "C:\\Users\\labfa\\test\\doc.csv";
        String arquivo = "c:\\Users\\labfa\\test\\arquivo.csv";
        
        try (BufferedReader buff = new BufferedReader(new FileReader(path));
             BufferedWriter br = new BufferedWriter(new FileWriter(arquivo))) {
            
            String line = buff.readLine();
            
            while (line != null) {
                String[] campos = line.split(",");
                
                if (campos.length >= 3) {
                    try {
                        String nome = campos[0];
                        double preco = Double.parseDouble(campos[campos.length - 2].trim());
                        int quantidade = Integer.parseInt(campos[campos.length - 1].trim());
                        
                        double valorTotal = preco * quantidade;
                        
                        // Escreve no arquivo com um espaço entre nome e valorTotal
                        br.write(nome + ", " + valorTotal);
                        br.newLine();
                        
                    } catch (NumberFormatException e) {
                        System.out.println("Erro ao converter número: " + e.getMessage());
                    }
                }
                
                line = buff.readLine();
            }
            
            System.out.println("Processamento concluído.");
            
        } catch (IOException e) {
            System.out.println("Erro ao processar arquivo: " + e.getMessage());
        }
    }
}
