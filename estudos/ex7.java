import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String t = " " ;
        int G = 0, V = 0, O = 0;
        while(!t.equals("F")){
            System.out.println("Para qual time você torce? G- Goias V-Vila Nova O- Outros");
            t = scr.next();
            switch (t) {
                case "G":
                   G++; 
                    break;
                case "V":
                    V++;
                    break;
                case "O":
                    O++;
                    break;
                case "F":
                    System.out.println("Fim da contagem");
                    break;
                default:
                System.out.println("Resposta invalida");
                    break;
            }
        }
        System.out.println(G + " torcem para o goias");
        System.out.println(V + " torcem para o Vila");
        System.out.println(O + " torcem para outros times");
    }
}
