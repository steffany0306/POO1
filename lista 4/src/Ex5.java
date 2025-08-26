import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int TAM = 20;
        int[] numeros = new int[TAM];
        int[] par = new int[TAM];
        int[] impar = new int[TAM];
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0) {
                par[contPar] = numeros[i];
                contPar++;
            } else {
                impar[contImpar] = numeros[i];
                contImpar++;
            }
        }

        entrada.close();

        System.out.print("Números: ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.print("Pares: ");
        for (int i = 0; i < contPar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.print("\nÍmpares: ");
        for (int i = 0; i < contImpar; i++) {
            System.out.print(impar[i] + " ");
        }
    }
}
