import java.util.Scanner;
public class Excinco {

	public static void main(String[] args) {
Scanner entrada= new Scanner(System.in);

	System.out.println("Digite um número em centímetros");
	int cent = entrada.nextInt();
	
	System.out.println(cent + " centímetros em metros é " + cent/100);
		
	entrada.close();
	}

}
