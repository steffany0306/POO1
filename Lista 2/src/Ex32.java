import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipos de carne disponíveis:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        System.out.print("Escolha o tipo de carne (1, 2 ou 3): ");
        int tipo = entrada.nextInt();

        System.out.print("Digite a quantidade (kg): ");
        double quantidade = entrada.nextDouble();

        System.out.print("Pagamento com cartão Tabajara? (s/n): ");
        char cartao = entrada.next().toLowerCase().charAt(0);

        String nomeCarne = "";
        double precoKg = 0;

        if (tipo == 1) {
            nomeCarne = "Filé Duplo";
            precoKg = (quantidade <= 5) ? 4.90 : 5.80;
        } else if (tipo == 2) {
            nomeCarne = "Alcatra";
            precoKg = (quantidade <= 5) ? 5.90 : 6.80;
        } else if (tipo == 3) {
            nomeCarne = "Picanha";
            precoKg = (quantidade <= 5) ? 6.90 : 7.80;
        } else {
            System.out.println("Tipo de carne inválido.");
            entrada.close();
            return;
        }

        double total = quantidade * precoKg;
        double desconto = (cartao == 's') ? total * 0.05 : 0;
        double valorFinal = total - desconto;

        System.out.println("--- CUPOM FISCAL ---");
        System.out.println("Tipo de carne: " + nomeCarne);
        System.out.printf("Quantidade: "+ quantidade + "kg");
        System.out.printf("Preço total: R$", total);
        System.out.println("Pagamento: " + (cartao == 's' ? "Cartão Tabajara" : "Outro"));
        System.out.printf("Desconto: R$ "+ desconto);
        System.out.printf("Valor a pagar: R$ "+ valorFinal);

        entrada.close();
    }
}
