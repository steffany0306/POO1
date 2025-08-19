import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            double total = 0;
            int contador = 1;

            System.out.println("\nLojas Tabajara");
            
            while (true) {
                System.out.print("Produto " + contador + ": R$ ");
                double preco = entrada.nextDouble();

                if (preco == 0) {
                    break;
                }

                total += preco;
                contador++;
            }

            System.out.println("Total: R$ " + total);

            System.out.print("Dinheiro: R$ ");
            double dinheiro = entrada.nextDouble();

            double troco = dinheiro - total;
            System.out.printf("Troco: " + troco);

            System.out.println("Nova compra? (s/n): ");
            String resposta = entrada.next();

            if (!resposta.equalsIgnoreCase("s")) {
                System.out.println("Encerrando");
                break;
            }
        }
        
        entrada.close();
    }
}
