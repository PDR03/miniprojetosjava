import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite o numero que deseja fatorar:");
        int x = scr.nextInt();
        int f = x, y;
        y = x;
        if(x > 0){
            while(x > 1){
                f = f * (x -1);
                x--;
            }
            System.out.println("o fatorial de " + y + " é " + f);
        }else{
            System.out.println("Valor invalido");
        }  
    }
}
