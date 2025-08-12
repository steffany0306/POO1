import java.util.Scanner;
public class Exoito {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Quantas horas você trabalha por mês?");
		int horas= entrada.nextInt();
		
		System.out.println("Quanto você ganha por hora?");
		int valor= entrada.nextInt();
		
		System.out.println("O seu salário no mês é " + horas*valor);
		
		entrada.close();
	}

}
