import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;

        System.out.print("Digite o número total de votantes: ");
        int totalVotantes = entrada.nextInt();

        for (int i = 1; i <= totalVotantes; i++) {
            System.out.println("\nVotante " + i + ":");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            System.out.print("Digite o número do candidato: ");
            int voto = entrada.nextInt();

            switch (voto) {
                case 1:
                	voto1++;
                    break;
                case 2:
                	voto2++;
                    break;
                case 3:
                	voto3++;
                    break;
                default:
                    System.out.println("Voto inválido! Não será contabilizado.");
            }
        }

        System.out.println("Resultado da eleição:");
        System.out.println("Candidato 1 teve " + voto1 + " votos");
        System.out.println("Candidato 2 teve " + voto2 + " votos");
        System.out.println("Candidato 3 teve " + voto3 + " votos");

        entrada.close();
    }
}
