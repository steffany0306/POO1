import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de termos da série: ");
        int n = entrada.nextInt();

        double soma = 0.0;
        int denominador = 1;

        System.out.print("S = ");

        for (int i = 1; i <= n; i++) {
            double termo = (double) i / denominador;
            soma += termo;

            System.out.print(i + "/" + denominador);
            if (i < n) {
                System.out.print(" + ");
            }

            denominador += 2;
        }

        System.out.println("Soma da série com " + n + " termos = " + soma);
        
        entrada.close();
    }
}
