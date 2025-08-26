import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de atletas: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[n];
        double[][] saltos = new double[n][5];
        double[] medias = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nAtleta " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            double soma = 0;
            double menor = Double.MAX_VALUE;

            for (int j = 0; j < 5; j++) {
                System.out.print("  Salto " + (j + 1) + ": ");
                saltos[i][j] = scanner.nextDouble();
                soma += saltos[i][j];
                if (saltos[i][j] < menor) {
                    menor = saltos[i][j];
                }
            }
            scanner.nextLine(); 

            medias[i] = (soma - menor) / 4;
            System.out.printf("Média (desprezando o pior salto): %.2f\n", medias[i]);
        }

        System.out.println("\n--- Resultados Finais ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s - Saltos: ", nomes[i]);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%.2f ", saltos[i][j]);
            }
            System.out.printf(" | Média: %.2f\n", medias[i]);
        }

        int campeao = 0, ultimo = 0;
        for (int i = 1; i < n; i++) {
            if (medias[i] > medias[campeao]) campeao = i;
            if (medias[i] < medias[ultimo]) ultimo = i;
        }

        System.out.println("\n--- Pódio ---");
        System.out.printf("Campeão: %s com média %.2f\n", nomes[campeao], medias[campeao]);
        System.out.printf("Último lugar: %s com média %.2f\n", nomes[ultimo], medias[ultimo]);
    }
}
