import java.util.Scanner;

public class Ex31{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos (kg): ");
        double kgMorango = entrada.nextDouble();

        System.out.print("Digite a quantidade de maçãs (kg): ");
        double kgMaca = entrada.nextDouble();

        double precoMorango = (kgMorango <= 5) ? 2.50 : 2.20;
        double precoMaca = (kgMaca <= 5) ? 1.80 : 1.50;

        double totalMorango = kgMorango * precoMorango;
        double totalMaca = kgMaca * precoMaca;
        double totalCompra = totalMorango + totalMaca;

        if ((kgMorango + kgMaca) > 8 || totalCompra > 25.00) {
            totalCompra *= 0.90; 
        }

        System.out.println("Valor a pagar: R$"+ totalCompra);

        entrada.close();
    }
}
