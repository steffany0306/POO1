import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
            System.out.println("Divisores de " + numero + ": ");
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i + " ");
                }
            }
            System.out.println();
        }
        
        entrada.close();
    }
}
