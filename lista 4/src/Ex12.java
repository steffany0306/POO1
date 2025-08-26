import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] idades = new int[5];
        double[] alturas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("Idade: ");
            idades[i] = entrada.nextInt();
            System.out.print("Altura (em metros): ");
            alturas[i] = entrada.nextDouble();
        }

        System.out.println("Dados em ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + ": Idade = " + idades[i] + ", Altura = " + alturas[i]);
        }

        int maisVelho = idades[0], maisNovo = idades[0];
        double maisAlto = alturas[0], maisBaixo = alturas[0];
        int idxVelho = 0, idxNovo = 0, idxAlto = 0, idxBaixo = 0;

        int somaIdades = 0;
        double somaAlturas = 0;

        for (int i = 0; i < 5; i++) {
            somaIdades += idades[i];
            somaAlturas += alturas[i];

            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
                idxVelho = i;
            }
            if (idades[i] < maisNovo) {
                maisNovo = idades[i];
                idxNovo = i;
            }
            if (alturas[i] > maisAlto) {
                maisAlto = alturas[i];
                idxAlto = i;
            }
            if (alturas[i] < maisBaixo) {
                maisBaixo = alturas[i];
                idxBaixo = i;
            }
        }

        double mediaIdade = somaIdades / 5.0;
        double mediaAltura = somaAlturas / 5.0;

        System.out.println("Mais velho: Idade = " + maisVelho + ", Altura = " + alturas[idxVelho]);
        System.out.println("Mais novo: Idade = " + maisNovo + ", Altura = " + alturas[idxNovo]);
        System.out.println("Mais alto: Altura = " + maisAlto + ", Idade = " + idades[idxAlto]);
        System.out.println("Mais baixo: Altura = " + maisBaixo + ", Idade = " + idades[idxBaixo]);

        System.out.println("Média de idade: " + mediaIdade);
        System.out.println("Média de altura: " + mediaAltura);

        System.out.println("Pessoas acima da média:");
        for (int i = 0; i < 5; i++) {
            if (idades[i] > mediaIdade || alturas[i] > mediaAltura) {
                System.out.println("Pessoa " + (i + 1) + ": Idade = " + idades[i] + ", Altura = " + alturas[i]);
            }
        }

        System.out.println("Pessoas abaixo da média:");
        for (int i = 0; i < 5; i++) {
            if (idades[i] < mediaIdade || alturas[i] < mediaAltura) {
                System.out.println("Pessoa " + (i + 1) + ": Idade = " + idades[i] + ", Altura = " + alturas[i]);
            }
        }

        entrada.close();
    }
}
