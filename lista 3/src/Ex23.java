import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int turmas = entrada.nextInt();

        int soma = 0;

        for (int i = 1; i <= turmas; i++) {
            System.out.print("Digite a quantidade de alunos da turma " + i + ": ");
            int alunos = entrada.nextInt();

            while (alunos > 40) {
                System.out.println("Erro: A turma não pode ter mais de 40 alunos. Tente novamente.");
                System.out.print("Digite a quantidade de alunos da turma " + i + ": ");
                alunos = entrada.nextInt();
            }

            soma += alunos;
        }

        double media = (double) soma / turmas;
        System.out.println("Média de alunos por turma: " + media);
    
    entrada.close();
    }
}
