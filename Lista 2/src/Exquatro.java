import java.util.Scanner;
public class Exquatro {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um ano com 4 dígitos");
		double ano= entrada.nextDouble();
		
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

	entrada.close();	
		
	}

}
