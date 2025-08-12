import java.util.Scanner;
public class Exonze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite M-Matutino ou V-Vespertino ou N-Noturno.");
        char hora = entrada.next().toUpperCase().charAt(0);
        
        if (hora == 'M') {
        	System.out.println("Bom dia!");
        }
        if (hora == 'V') {
        	System.out.println("Boa tarde!");
        }
        if (hora == 'N') {
        	System.out.println("Boa noite!");
        }
	entrada.close();
	}

}
