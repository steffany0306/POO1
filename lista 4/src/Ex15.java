import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        final int N = 5; 
        int[] valores = new int[N];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            int valor;
            do {
                System.out.print("Digite um valor entre 0 e 20 para a posição " + i + ": ");
                valor = entrada.nextInt();
                if (valor < 0 || valor > 20) {
                    System.out.println("Valor inválido! Tente novamente.");
                }
            } while (valor < 0 || valor > 20);
            valores[i] = valor;
        }

        System.out.println("Gráfico:");
        for (int i = 0; i < N; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        entrada.close();
    }
}
