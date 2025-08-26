import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		final int TAM = 10;
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[TAM];
		
		for (int i=0; i<TAM; i++){
			System.out.println("Digite um número");
			numeros[i] = entrada.nextInt();
		}
		
		for (int i=TAM-1; i>=0; i--){
		System.out.println(numeros[i]);
		
		}
		entrada.close();
		}
	
}