import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
			
	Scanner entrada=new Scanner(System.in);
	System.out.println("Digite o número da tabuada que você precisa (de 1 a 10)");
	int tab = entrada.nextInt();
	
	int inicio=1;
	
	for (int x = inicio; inicio<=10; inicio++) {
		System.out.println(tab + " x " + inicio + " = " +tab*inicio);
	}
		
		entrada.close();
			
	}

}
