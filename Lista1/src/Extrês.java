import java.util.Scanner;
public class Extrês {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	System.out.println("Digite um número");	
	int num1 = entrada.nextInt();
	
	System.out.println("Digite um número");
	int num2 = entrada.nextInt();
	
	System.out.println("A soma dos números é " + (num1+num2));
	
	entrada.close();
	
	}

}
