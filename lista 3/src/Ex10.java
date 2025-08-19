import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

	System.out.println("Digite um número para a base da conta");
	int base = entrada.nextInt();
	
	System.out.println("Digite um número para o expoente");
	int exp = entrada.nextInt();
	
	int result=1;
	
	for (int x = 0;x<exp; x++){
		result*=base;		
	}	
	
	System.out.println("O resultado de "+ base + " elevado a " + exp + " é igual a " + result);
	
	entrada.close();
	}

}
