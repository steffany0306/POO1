import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite várias palavras separadas por ponto e vírgula (;): ");
        String palavra = entrada.nextLine();

        String[] palavras = palavra.split(";");

        System.out.println("Palavras separadas:");
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Posição " + i + ": " + palavras[i]);
        }

        entrada.close();
    }
}
