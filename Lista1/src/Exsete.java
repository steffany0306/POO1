import java.util.Scanner;
public class Exsete{

	public static void main(String[] args) {
Scanner entrada= new Scanner(System.in);

	System.out.println("Qual é a medida de lado do quadrado?");
	float lado= entrada.nextFloat();

	
	System.out.println("A área do quadrado é " + lado*lado);
	
	entrada.close();
	}

}
