import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        int n = entrada.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            double nota = entrada.nextDouble();
            soma += nota;
        }

        double media = soma / n;

        System.out.println("Média aritmética das notas = " + media);
        
        entrada.close();
    }
}
