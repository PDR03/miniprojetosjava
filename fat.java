import java.util.Scanner;

public class fat {
    public static void main(String[] args) {
        int n;
        int res = 1;
     
    Scanner view = new Scanner(System.in);
    System.out.println("Diga um numero para fatorar");
    n = view.nextInt();

    while (n < 0){
        System.out.println("não é possivel fatorar numeros negativos");
        System.out.println("Diga um numero POSITIVO para fatorar");
    n = view.nextInt();
    }  

    while (n >= 1) {
    res *= n;
    n--;
    }
       
     
    System.out.println("fatorial de é " + res);       
    }
}
