import java.util.Scanner;
public class Exonze {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
			System.out.println("Qual sua altura em metros?");
		int alt= entrada.nextInt();
	
		double alt2= alt*72.7;
		
		System.out.println("O seu peso ideal é "+ (alt2-58));
		entrada.close();
	}

}
