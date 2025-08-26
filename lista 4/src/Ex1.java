import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int[] numeros = new int[TAM];
		
		
		for (int i=0; i<TAM; i++){
			System.out.println("Digite um número");
			numeros[i] = entrada.nextInt();
			
		}
		
		for (int i=0; i<TAM; i++){
		System.out.println(numeros[i]);
		
		}
		entrada.close();
		}
	
}