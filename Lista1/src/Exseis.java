import java.util.Scanner;
public class Exseis{

	public static void main(String[] args) {
Scanner entrada= new Scanner(System.in);

	System.out.println("Qual é o raio do círculo?");
	float raio= entrada.nextFloat();

	
	System.out.println("A área do círculo é " + (raio*raio)*3);
	
	entrada.close();
	}

}