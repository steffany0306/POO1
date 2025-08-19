import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de números (N): ");
        int n = entrada.nextInt();

        int menor, maior;
        int soma = 0;

        System.out.print("Digite o 1º número: ");
        int numero = entrada.nextInt();
        menor = maior = numero;
        soma += numero;

        for (int i = 2; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = entrada.nextInt();

            if (numero < menor) menor = numero;
            if (numero > maior) maior = numero;
            soma += numero;
        }

        System.out.println("Menor " + menor);
        System.out.println("Maior " + maior);
        System.out.println("Soma " + soma);
        
        entrada.close();
    }
}
