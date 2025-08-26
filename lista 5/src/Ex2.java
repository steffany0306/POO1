import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] precos = new double[5][5]; 

        // Entrada de dados
        for (int i = 0; i < 5; i++) {
            System.out.println("Supermercado " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("  Preço do produto " + (j + 1) + ": ");
                precos[i][j] = entrada.nextDouble();
            }
        }

        System.out.println("Preços em cada supermercado:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Supermercado " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.println(precos[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Média de preço por produto:");
        for (int j = 0; j < 5; j++) {
            double soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += precos[i][j];
            }
            System.out.printf("Produto "+ j + 1+ soma / 5);
        }

        System.out.println("Soma de preços por supermercado:");
        double[] somas = new double[5];
        for (int i = 0; i < 5; i++) {
            double soma = 0;
            for (int j = 0; j < 5; j++) {
                soma += precos[i][j];
            }
            somas[i] = soma;
            System.out.printf("Supermercado "+ i + 1+ soma);
        }

        int barato = 0, caro = 0;
        for (int i = 1; i < 5; i++) {
            if (somas[i] < somas[barato]) barato = i;
            if (somas[i] > somas[caro]) caro = i;
        }

        System.out.println("Mais barato:"+ barato+1+" Supermercado com total de "+ somas[barato]);
        System.out.println("Mais caro:" + caro +1+ "Supermercado com total de "+ somas[caro]);
        entrada.close();
    }
}

