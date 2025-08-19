import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int n = entrada.nextInt();

        int total = 0;

        System.out.println("Números primos entre 1 e " + n + ":");

        for (int num = 2; num <= n; num++) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                total++;
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(num + " ");
            }
        }

        System.out.println("Total de divisões realizadas: " + total);
        entrada.close();
    }
}
