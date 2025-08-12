
import java.util.Scanner;

public class Exdoze {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = entrada.nextDouble();

        double percentual = 0;

        if (salarioAtual <= 280) {
            percentual = 20;
        } else if (salarioAtual <= 700) {
            percentual = 15;
        } else if (salarioAtual <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        double valorAumento = salarioAtual * (percentual / 100);
        double novoSalario = salarioAtual + valorAumento;

        System.out.println("--- Reajuste Salarial ---");
        System.out.println("Salário antes do reajuste: R$"+ salarioAtual);
        System.out.println("Percentual de aumento aplicado: "+ percentual);
        System.out.println("Valor do aumento: R$"+ valorAumento);
        System.out.println("Novo salário após o aumento: R$"+ novoSalario);

        entrada.close();
    }
}
