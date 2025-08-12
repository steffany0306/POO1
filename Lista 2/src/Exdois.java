import java.util.Scanner;
public class Exdois {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número");
		Double num = entrada.nextDouble();
		
		if (num>0) {
			System.out.println("O número é positivo");
		} else if (num<0) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("O número é 0");
		}
		
		entrada.close();
		
	}

}
