import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] nomes = new String[n];
        double[][] notas = new double[n][2];
        double[] medias = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Nota 1: ");
            notas[i][0] = scanner.nextDouble();
            System.out.print("Nota 2: ");
            notas[i][1] = scanner.nextDouble();
            scanner.nextLine(); 
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        System.out.println("\n--- Dados dos Alunos ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s - Nota 1: %.2f, Nota 2: %.2f, Média: %.2f\n",
                    nomes[i], notas[i][0], notas[i][1], medias[i]);
        }

        double maiorNota = Double.MIN_VALUE, menorNota = Double.MAX_VALUE;
        String alunoMaiorNota = "", alunoMenorNota = "";

        double maiorMedia = Double.MIN_VALUE, menorMedia = Double.MAX_VALUE;
        String alunoMaiorMedia = "", alunoMenorMedia = "";

        double somaMedias = 0;

        for (int i = 0; i < n; i++) {
            somaMedias += medias[i];

            for (int j = 0; j < 2; j++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                    alunoMaiorNota = nomes[i];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                    alunoMenorNota = nomes[i];
                }
            }

            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = nomes[i];
            }
        }

        double mediaGeral = somaMedias / n;

        System.out.println("\n--- Estatísticas ---");
        System.out.printf("Maior nota: %.2f (%s)\n", maiorNota, alunoMaiorNota);
        System.out.printf("Menor nota: %.2f (%s)\n", menorNota, alunoMenorNota);
        System.out.printf("Maior média: %.2f (%s)\n", maiorMedia, alunoMaiorMedia);
        System.out.printf("Menor média: %.2f (%s)\n", menorMedia, alunoMenorMedia);
        System.out.printf("Média geral da turma: %.2f\n", mediaGeral);

        System.out.println("\nAlunos acima da média geral:");
        for (int i = 0; i < n; i++) {
            if (medias[i] > mediaGeral) {
                System.out.println(nomes[i]);
            }
        }

        System.out.println("\nAlunos abaixo da média geral:");
        for (int i = 0; i < n; i++) {
            if (medias[i] < mediaGeral) {
                System.out.println(nomes[i]);
            }
        }
    }
}
