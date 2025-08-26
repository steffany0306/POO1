import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanho;

        do {
            System.out.print("Digite um número ímpar entre 3 e 11: ");
            tamanho = entrada.nextInt();
        } while (tamanho < 3 || tamanho > 11 || tamanho % 2 == 0);

        int[][] matriz = new int[tamanho][tamanho];
        int soma = 0, pares = 0, impares = 0;
        int maior = 0;
        int menor = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        System.out.println("Informe os valores da matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = entrada.nextInt();

                soma += matriz[i][j];
                if (matriz[i][j] % 2 == 0) pares++;
                else impares++;
                if (matriz[i][j] > maior) maior = matriz[i][j];
                if (matriz[i][j] < menor) menor = matriz[i][j];
                if (i == j) somaDiagonalPrincipal += matriz[i][j];
                if (i + j == tamanho - 1) somaDiagonalSecundaria += matriz[i][j];
            }
        }

        double media = (double) soma / (tamanho * tamanho);

        System.out.println("--- Resultados ---");
        System.out.println("Soma dos elementos: " + soma);
        System.out.printf("Média dos elementos: ", media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

        System.out.println("Matriz informada:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
            
        }
        entrada.close();
    }
}
