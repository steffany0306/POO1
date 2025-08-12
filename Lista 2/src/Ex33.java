import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char[] gabarito = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
        char[] respostas = new char[10];
        int pontuacao = 0;

        System.out.println("Digite as respostas da prova (a, b, c, d, e):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Q" + (i + 1) + ": ");
            respostas[i] = entrada.next().toLowerCase().charAt(0);
        }

        System.out.println("\nResultado da Prova:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Q" + (i + 1) + ": " + respostas[i] + " : ");
            if (respostas[i] == gabarito[i]) {
                System.out.println("Correto");
                pontuacao++;
            } else {
                System.out.println("Errada, resposta correta (" + gabarito[i] + ")");
            }
        }

        System.out.println("Pontuação Final: " + pontuacao + " de 10");

        entrada.close();
    }
}
