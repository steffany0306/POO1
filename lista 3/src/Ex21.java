import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de pessoas na turma: ");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("O número de pessoas deve ser maior que zero.");
            return;
        }

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = entrada.nextInt();
            soma += idade;
        }

        double media = (double) soma / n;

        System.out.println("\nMédia de idade da turma: " + media);

        if (media <= 25) {
            System.out.println("A turma é jovem.");
        } else if (media <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }
        entrada.close();
    }
}
