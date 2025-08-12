import java.util.Scanner;

public class Exdezoito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o lado A:");
        double ladoA = entrada.nextDouble();

        System.out.println("Digite o lado B:");
        double ladoB = entrada.nextDouble();

        System.out.println("Digite o lado C:");
        double ladoC = entrada.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            System.out.println("Os lados formam um triângulo.");

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Tipo: Triângulo Equilátero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Tipo: Triângulo Isósceles");
            } else {
                System.out.println("Tipo: Triângulo Escaleno");
            }
        } else {
            System.out.println("Os lados NÃO formam um triângulo.");
        }

        entrada.close();
    }
}
