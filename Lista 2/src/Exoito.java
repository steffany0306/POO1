import java.util.Scanner;
public class Exoito {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

	System.out.println("Escreva sua primeira nota");
	int nota1 = entrada.nextInt();
	System.out.println("Escreva sua segunda nota");
	int nota2 = entrada.nextInt();
	
	var media = nota1 + nota2;
	
	if (media/2>7) {
		System.out.println("Aprovado");
	}
	else if (media/2 < 7) {
	System.out.println("Reprovado");
	}
	
	 entrada.close();
	}

}
