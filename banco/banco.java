package aula_03;

import java.util.Random;
import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        cbank c1 = new cbank();
        c1.setnConta(342);
        c1.setDono("rogerio");
        Random nconta = new Random();
        Scanner scanner = new Scanner(System.in);     
     int nContamin = 1000;
     int nContamax = 9999;
     System.out.println("Bem vindo ao app do banco TALAY");
      System.out.println("Vamos começar seu cadastro!! Me diga primeiro seu nome completo");
     c1.setDono(scanner.nextLine());
     System.out.println("Certo anotado, qual conta deseja abrir " + c1.getDono()+"?:");
     System.out.println("CC ou CP");
     String escolha = scanner.nextLine();
        switch (escolha) {
             case "CC": 
                 c1.openCount("CC");
                 c1.setTipo("CC");
                 c1.setnConta( (int) (Math.random() * (nContamax - nContamin + 1) + nContamin));
                 break;
             case "CP": 
                 c1.openCount("CP");
                 c1.setTipo("CP");
                 c1.setnConta( (int) (Math.random() * (nContamax - nContamin + 1) + nContamin));
                 break;
             default:
                 break;
        
        }
        System.out.println("Sua conta foi criada com sucesso!!");
        System.out.println(c1.getDono() + " escolha uma das opções 1- ver dados 2-depositar 3-sacar 4-encerrar");
    int resp;
    resp = scanner.nextInt();

        while (resp != 4) {
            switch (resp) {
                case 1:
                    System.out.println("Nome do usuario " + c1.getDono());
                    System.out.println("Tipo da conta " + c1.getTipo());
                    System.out.println("numero da conta " + c1.getnConta());
                    System.out.println("Saldo da conta " + c1.getsaldo());

                resp = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Qual a quantia do deposito?");
                    c1.deposit(scanner.nextFloat());
                    System.out.println("Deposito feito com sucesso você tem " + c1.getsaldo() + ". deseja fazer mais alguma alteração?");
                     System.out.println(c1.getDono() + " escolha uma das opções 1- ver dados 2-depositar 3-sacar 4-encerrar");
                    resp = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Qual valor você deseja sacar?");
                    c1.withdraw(scanner.nextFloat());
                    System.out.println("saque feito com sucesso!");
                    System.out.println(c1.getDono() + " escolha uma das opções 1- ver dados 2-depositar 3-sacar 4-encerrar");
                    resp = scanner.nextInt();
                    break;                    
                }
    System.out.println("encerrado com sucesso");
        
        }
    
    }    
}
