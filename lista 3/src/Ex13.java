import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = entrada.nextInt();

        long fat = 1;

        for (int i = numero; i > 1; i--) {
            fat *= i;
        }

        System.out.println(numero + "! = " + fat);
        
        entrada.close();
    }
}
