import java.util.Scanner;

public class Extreze {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso de peixes trazido (em kg): ");
        double peso = entrada.nextDouble();

        double excesso = 0;
        double multa = 0;
        final double LIMITE = 50.0;
        final double VALOR_MULTA = 4.0;

        if (peso > LIMITE) {
            excesso = peso - LIMITE;
            multa = excesso * VALOR_MULTA;
        }

        System.out.println("Excesso: "+ excesso);
        System.out.println("Multa a pagar: "+ multa);
        
       entrada.close(); 
    }
}
