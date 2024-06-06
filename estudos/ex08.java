import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n, max, min;
        System.out.println("Diga o numero que deseja verificar:");
        n = scr.nextInt();
        System.out.println("Digite o minimo do intervalo");
        min = scr.nextInt();
        System.out.println("Digite o maximo do intervalo");
        max = scr.nextInt();
        while(min <= max){
            if(min % n == 0){
                System.out.println("O numero " + min + " é divisivel por " + n); 
            }
            min++;
        }
    }
}
