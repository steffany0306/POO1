import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double precoAlcool = 1.90;
        final double precoGasolina = 2.50;

        System.out.print("Digite o número de litros vendidos: ");
        double litros = entrada.nextDouble();

        System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        char tipo = entrada.next().toUpperCase().charAt(0);

        double precoLitro = 0;
        double descontoPorLitro = 0;

        if (tipo == 'A') {
            precoLitro = precoAlcool;
            descontoPorLitro = (litros <= 20) ? 0.03 : 0.05;
        } else if (tipo == 'G') {
            precoLitro = precoGasolina;
            descontoPorLitro = (litros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.println("Tipo de combustível inválido.");
            entrada.close();
            return;
        }

        double valorBruto = precoLitro * litros;
        double valorDesconto = valorBruto * descontoPorLitro;
        double valorFinal = valorBruto - valorDesconto;

        System.out.printf("Tipo de combustível: "+ (tipo == 'A' ? "Álcool" : "Gasolina"));
        System.out.printf("Litros vendidos: "+ litros);
        System.out.printf("Preço bruto: R$ "+ valorBruto);
        System.out.printf("Desconto aplicado: R$ "+ valorDesconto);
        System.out.printf("Valor a pagar: R$ "+ valorFinal);

        entrada.close();
    }
}
