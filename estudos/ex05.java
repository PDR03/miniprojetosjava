import java.util.Scanner;

public class ex05 {
    public static void main(String[]args){
        Scanner scr = new Scanner(System.in);
        int qnt = 0, num = 1, soma = 0;
        double media;
        while(num != 0){
            System.out.println("Digite um numero(0 para encerrar)");
            num = scr.nextInt();
            soma += num;
            qnt++;
        }
        media = soma / (qnt - 1);
        System.out.println("A soma dos numeros é " + soma);
        System.out.println("A quantidade de numeros digitados é " + (qnt - 1));
        System.out.println("A média é " + media);

    }
}
