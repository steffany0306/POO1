
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char repetir;

        do {
            double popA, taxaA, popB, taxaB;

            do {
                System.out.print("Informe a população do país A (maior que 0): ");
                popA = entrada.nextDouble();
            } while (popA <= 0);

            do {
                System.out.print("Informe a taxa de crescimento anual do país A (em %, maior que 0): ");
                taxaA = entrada.nextDouble();
            } while (taxaA <= 0);

            do {
                System.out.print("Informe a população do país B (maior que 0): ");
                popB = entrada.nextDouble();
            } while (popB <= 0);

            do {
                System.out.print("Informe a taxa de crescimento anual do país B (em %, maior que 0): ");
                taxaB = entrada.nextDouble();
            } while (taxaB <= 0);

            int anos = 0;
            while (popA < popB) {
                popA += popA * (taxaA / 100);
                popB += popB * (taxaB / 100);
                anos++;
            }

            System.out.println("População do país A ultrapassará ou igualará a do país B em " + anos + " anos.");
            System.out.println("População final de A: "+ popA);
            System.out.println("População final de B: "+ popB);

            System.out.println("\nDeseja repetir a operação? (s/n): ");
            repetir = entrada.next().toLowerCase().charAt(0);

        } while (repetir == 's');

        entrada.close();
    }
}
