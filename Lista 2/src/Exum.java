import java.util.Scanner;

public class Exum {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	
		
		System.out.println("Digite um número");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número");
		double num2 = entrada.nextDouble();
		
		if (num1>num2) {
			System.out.println("O maior número é " + num1);
		} else if (num2>num1) {
			System.out.println("O maior número é " + num2);
		} else {
			System.out.println("Os dois números são iguais");
		}
		
		entrada.close();
		
		}	
		
	}
