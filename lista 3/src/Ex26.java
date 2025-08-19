import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do pão: R$ ");
        double preco = entrada.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
        System.out.println("---------------------------------------------");

        for (int i = 1; i <= 50; i++) {
            double valor = i * preco;
            System.out.println(i + " - " + valor);
            entrada.close();
        }
    }
}
