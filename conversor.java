import java.util.Scanner;

public class conversor {

    static float cel(float c) {
        return (c * 9 / 5) + 32;

    }

    static float fah(float f) {
        return (f - 32) * (5 / 9);
    }

    // temperatura
    static double pe(float p) {
        return (p / 3.281);
    }

    static double met(float m) {
        return (m * 3.281);
    }

    // Medida
    static double dol(float d) {
        return (d * 0.94);
    }

    static double eur(float e) {
        return (e / 1.06);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float temp;
        float med;
        float moe;

        System.out.println("Diga qual conversão você deseja fazer");
        System.out.println("1-Celsius e Fahrenheit");
        System.out.println("2-Metro e pés");
        System.out.println("3- Dólar e euro");
        int unidade = scanner.nextInt();
        while ((unidade < 1) || (unidade > 3)) {
            System.out.println("opção indisponivel digite novamente");
            unidade = scanner.nextInt();
        }
        if (unidade == 1) {
            System.out.println("Escolha a conversão");
            System.out.println("1-Celsius para Fahrenheit");
            System.out.println("2-Fahrenheit para Celsius");
            int escolha = scanner.nextInt();
            while ((escolha < 1) || (escolha > 2)) {
                System.out.println("valor invalido digite novamente");
                escolha = scanner.nextInt();
            }

            if (escolha == 1) {
                System.out.println("Digite a temperatura em C°");
                temp = scanner.nextFloat();
                float fahren = cel(temp);
                System.out.println("A temperatura em Fahrenheit é " + fahren);
            } else if (escolha == 2) {
                System.out.println("Digite a temperatura em F°");
                temp = scanner.nextFloat();
                float celsi = fah(temp);
                System.out.println("A temperatura em Celsius é " + celsi);
            }
        } else if (unidade == 2) {
            System.out.println("Escolha a conversão");
            System.out.println("1-Metros para pés");
            System.out.println("2-Pés para metros");
            int escolha = scanner.nextInt();

            while ((escolha < 1) || (escolha > 2)) {
                System.out.println("valor invalido digite novamente");
                escolha = scanner.nextInt();
            }
            if (escolha == 1) {
                System.out.println("Digite a mediade em M");
                med = scanner.nextFloat();
                double medida = met(med);
                System.out.println("A medida em pés é" + medida);
            } else if (escolha == 2) {
                System.out.println("Digite a medida em pés");
                med = scanner.nextFloat();
                double medida = pe(med);
                System.out.format("A medida em metros é %2f ", medida);
            }
        }

        else if (unidade == 3) {
            System.out.println("Escolha a conversão");
            System.out.println("1- Dólar para euro");
            System.out.println("2- Euro para dólar");
            int escolha = scanner.nextInt();
            while ((escolha < 1) && (escolha > 2)) {
                System.out.println("valor invalido digite novamente");
                escolha = scanner.nextInt();
                if (escolha == 1) {
                    System.out.println("Digite o valor em Dol");
                    moe = scanner.nextFloat();
                    double conversao = dol(moe);
                    System.out.println("O valor em euro é: " + conversao);

                } else if (escolha == 2) {
                    System.out.println("Digite o valor em euro");
                    moe = scanner.nextFloat();
                    double conversao = eur(moe);
                    System.out.println("O valor em dolar é:" + conversao);
                }
            }
        }
    }
}
