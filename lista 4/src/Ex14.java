import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] idades = new int[30];
        double[] alturas = new double[30];
        double somaAlturas = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.print("Idade: ");
            idades[i] = entrada.nextInt();
            System.out.print("Altura (em metros): ");
            alturas[i] = entrada.nextDouble();
            somaAlturas += alturas[i];
        }

        
        double mediaAltura = somaAlturas / 30;

        int contador = 0;
        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }

        System.out.println("Média de altura: " + mediaAltura);
        System.out.println("Quantidade de alunos com mais de 13 anos e altura abaixo da média: " + contador);

        entrada.close();
    }
}
