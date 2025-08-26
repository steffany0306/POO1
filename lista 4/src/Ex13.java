import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorIntercalado = new int[20];

        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("vetor1[" + i + "]: ");
            vetor1[i] = entrada.nextInt();
        }

        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("vetor2[" + i + "]: ");
            vetor2[i] = entrada.nextInt();
        }

        for (int i = 0, j = 0; i < 10; i++) {
            vetorIntercalado[j++] = vetor1[i];
            vetorIntercalado[j++] = vetor2[i];
        }

        System.out.println("Vetor intercalado:");
        for (int i = 0; i < 20; i++) {
            System.out.println("vetorIntercalado[" + i + "]: " + vetorIntercalado[i]);
        }

        entrada.close();
    }
}
