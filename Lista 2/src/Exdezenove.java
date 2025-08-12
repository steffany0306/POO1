import java.util.Scanner;

public class Exdezenove {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = entrada.nextDouble();

        if (a == 0) {
            System.out.println("O valor de A não pode ser zero. Isso não é uma equação do segundo grau.");
            entrada.close();
            return;
        }

        System.out.print("Digite o valor de B: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = entrada.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("Delta calculado: " + delta);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 +", " + raiz2);
        }

        entrada.close();
    }
}
