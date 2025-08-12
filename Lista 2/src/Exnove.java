
import java.util.Scanner;

public class Exnove {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura (em metros): ");
        double altura = entrada.nextDouble();

        System.out.println("Digite seu peso atual (em kg): ");
        double peso = entrada.nextDouble();

        System.out.println("Digite seu sexo (M para masculino, F para feminino): ");
        char sexo = entrada.next().toUpperCase().charAt(0);

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Use M ou F.");
            entrada.close();
            return;
        }

        System.out.println("--- Resultado ---");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso atual: " + peso + " kg");
        System.out.println("Sexo: " + (sexo == 'M' ? "Masculino" : "Feminino"));
        System.out.printf("Peso ideal: "+ pesoIdeal+ "kg");

       
        if (peso > pesoIdeal) {
            System.out.println(" Você está acima do peso ideal.");
        } else if (peso < pesoIdeal) {
            System.out.println(" Você está abaixo do peso ideal.");
        } else {
            System.out.println(" Você está no peso ideal.");
        }

        entrada.close();
    }
}
