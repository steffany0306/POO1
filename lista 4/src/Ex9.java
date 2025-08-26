import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = entrada.nextLine();

        char[] vetor = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            vetor[i] = texto.charAt(i);
        }

        System.out.println("Vetor de caracteres:");
        for (char c : vetor) {
            System.out.print(c + " ");
        }

        entrada.close();
    }
}
