import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de CDs na coleção: ");
        int quantidade = entrada.nextInt();

        double soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o valor do " + i + "º CD: R$ ");
            double valor = entrada.nextDouble();
            soma += valor;
        }

        double media = soma / quantidade;

        System.out.println("Valor total investido: R$ " + soma);
        System.out.println("Valor médio por CD: R$ " + media);
        
        entrada.close();
    }
}
