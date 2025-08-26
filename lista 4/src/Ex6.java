import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int ALUNOS = 10;
        final int NOTAS = 4;
        double[] medias = new double[ALUNOS];
        int aprovados = 0;

        for (int i = 0; i < ALUNOS; i++) {
            double soma = 0;
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < NOTAS; j++) {
                System.out.print("  Digite a " + (j + 1) + "ª nota: ");
                double nota = entrada.nextDouble();
                soma += nota;
            }
            medias[i] = soma / NOTAS;
            if (medias[i] >= 7.0) {
                aprovados++;
            }
        }

        entrada.close();

        System.out.println("Médias dos alunos:");
        for (int i = 0; i < ALUNOS; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }

        System.out.println("Número de alunos com média maior ou igual a 7.0: " + aprovados);
    }
}
