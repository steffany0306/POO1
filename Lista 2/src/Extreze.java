import java.util.Scanner;

public class Extreze {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora: R$ ");
        double valor = entrada.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horas = entrada.nextInt();

        double bruto = valor * horas;

        double ir = 0;
        if (bruto <= 900) {
            ir = 0;
        } else if (bruto <= 1500) {
            ir = bruto * 0.05;
        } else if (bruto <= 2500) {
            ir = bruto * 0.10;
        } else {
            ir = bruto * 0.20;
        }

        double inss = bruto * 0.10;
        double fgts = bruto * 0.11;

        double totalDescontos = ir + inss;
        double salarioLiquido = bruto - totalDescontos;

        System.out.println("--- Folha de Pagamento ---");
        System.out.printf("Salário Bruto: (%.2f * %d) : R$ %.2f\n", valor, horas, bruto);
        System.out.printf("(-) IR (%.0f%%) : R$ " + (ir == 0 ? 0 : (ir / bruto) * 100), ir);
        System.out.printf("(-) INSS (10%%) : R$ " + inss);
        System.out.printf("FGTS (11%%) : R$ " + fgts);
        System.out.printf("Total de descontos : R$ %.2f\n", totalDescontos);
        System.out.printf("Salário Líquido : R$ %.2f\n", salarioLiquido);

        entrada.close();
    }
}
