import java.util.Scanner;

public class media {
    public static void main(String[] args) {
    float n1;
    float n2;
    float n3;
    float n4;
    float media;
        System.out.println("Medidor de Média");
        System.out.println("Diga sua nota do 1ºBm:");
        Scanner nota1 = new Scanner(System.in);
        n1 = nota1.nextFloat();
        //Pede pro aluno digitar a nota        
                while ((n1 < 0 ) || (n1 > 10)) {
                    System.out.println("Nota inválida, digite uma nota do 1ºBm:");
                    n1 = nota1.nextFloat();
                }
                //nao deixa o aluno colocar uma nota menor que 0 e maior que 10
            if ((n1 >= 6) && (n1 <= 10)) {
                System.out.println("pasou nesse bimestre");}
            else {
                System.out.println("voce nao passou nesse bimestre");}
            //Mostra se ele passou ou não no Bimestre
        System.out.println("Diga sua nota do 2ºBm:");
        Scanner nota2 = new Scanner(System.in);
        n2 = nota2.nextFloat();
        //Pede pro aluno digitar a nota
                while ((n2 < 0 ) || (n2 > 10)) {
                    System.out.println("Nota inválida, digite uma nota do 2ºBm:");
                    n2 = nota1.nextFloat();
                }
                //nao deixa o aluno colocar uma nota menor que 0 e maior que 10
            if ((n2 >= 6) && (n2 <= 10)) {
                System.out.println("pasou nesse bimestre");}
            else {
                System.out.println("voce nao passou nesse bimestre");} 
            //Mostra se ele passou ou não no Bimestre    
        System.out.println("Diga sua nota do 3ºBm:");
        Scanner nota3 = new Scanner(System.in);
        n3 = nota3.nextFloat();
        //Pede pro aluno digitar a nota
                while ((n3 < 0 ) || (n3 > 10)) {
                    System.out.println("Nota inválida, digite uma nota do 3ºBm:");
                    n3 = nota1.nextFloat();
                }
                //nao deixa o aluno colocar uma nota menor que 0 e maior que 10
            if ((n3 >= 6) && (n3 <= 10)) {
                System.out.println("pasou nesse bimestre");}
            else {
                System.out.println("voce nao passou nesse bimestre");} 
            //Mostra se ele passou ou não no Bimestre
       System.out.println("Diga sua nota do 4ºBm:");
        Scanner nota4 = new Scanner(System.in);
        n4 = nota4.nextFloat(); 
        //Pede pro aluno digitar a nota
                while ((n4 < 0 ) || (n4 > 10)) {
                    System.out.println("Nota inválida, digite uma nota do 4ºBm:");
                    n4 = nota1.nextFloat();
                }
                //nao deixa o aluno colocar uma nota menor que 0 e maior que 10

        if ((n4 >= 6) && (n4 <= 10)) {
                System.out.println("pasou nesse bimestre");}
        else {
                System.out.println("voce nao passou nesse bimestre");}    
        //Mostra se ele passou ou não no Bimestre
    media = ((n1 + n2 + n3 + n4)) /4;
    //Soma e faz a média de todos os bimestres
    
    System.out.format("a sua média é %.1f ", media);
        if (media >= 6) {
            System.out.println("Parabéns, você passou de ano");}
        else {
            System.out.println("Poxa, você vai ter que fazer recuperação anual");} 
    }
}
