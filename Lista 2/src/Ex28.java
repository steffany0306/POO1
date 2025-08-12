import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = entrada.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.printf("Resultado da operação: ", resultado);

                        if (resultado % 1 == 0) {
                if ((int) resultado % 2 == 0) {
                    System.out.println("O resultado é par.");
                } else {
                    System.out.println("O resultado é ímpar.");
                }
            } else {
                System.out.println("O resultado não é um número inteiro, portanto não pode ser par ou ímpar.");
            }

            if (resultado > 0) {
                System.out.println("O resultado é positivo.");
            } else if (resultado < 0) {
                System.out.println("O resultado é negativo.");
            } else {
                System.out.println("O resultado é zero.");
            }

            if (resultado % 1 == 0) {
                System.out.println("O resultado é um número inteiro.");
            } else {
                System.out.println("O resultado é um número decimal.");
            }
        }

        entrada.close();
    }
}
