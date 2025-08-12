import java.util.Scanner;

public class Ex22{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = entrada.nextInt();

        if (numero >= 1000 || numero < 0) {
            System.out.println("Número inválido. Deve ser entre 0 e 999.");
        } else {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;

            
            String resultado = numero + " = ";
            if (centenas > 0) {
                resultado += centenas + " centena" + (centenas > 1 ? "s" : "");
                if (dezenas > 0 || unidades > 0) resultado += ", ";
            }
            if (dezenas > 0) {
                resultado += dezenas + " dezena" + (dezenas > 1 ? "s" : "");
                if (unidades > 0) resultado += " e ";
            }
            if (unidades > 0 || (centenas == 0 && dezenas == 0)) {
                resultado += unidades + " unidade" + (unidades > 1 ? "s" : "");
            }

            System.out.println(resultado);
        }

        entrada.close();
    }
}
