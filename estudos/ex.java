import java.util.Scanner;

public class ex{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = 0, num; 
        int max, min;
        float media;
        
        System.out.println("Digite um numero");
            num = scr.nextInt();
                max = num;
                min = num;
                n++;
                media = num;
        while(n != 11){
            System.out.println("Digite um numero");
            num = scr.nextInt();
            
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            media += num;
            
            }
            n++;
        }
        media = media/ n - 1;
        System.out.println("maximo" + max);
        System.out.println("min" + min);
        System.out.println("media" + media);
    }
}