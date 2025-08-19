import java.util.Scanner;
public class Ex1{
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

 int num=0;
	do {
		System.out.println("Digite uma nota de 0 a 10");
		num = entrada.nextInt();
		if(num>10 || num<0) {
			System.out.println("você escreveu um número inválido");
		}
	} while (num>10 || num<0 );
	System.out.println("Essa nota é válida");
	
		entrada.close();
		
	}

}
