import java.util.Scanner;
public class Exquatro {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite as 4 notas do bimestre");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		int num4 = entrada.nextInt();
		
		System.out.println("A sua média é " + (num1+num2+num3+num4)/4);
		
		entrada.close();
	}

}
