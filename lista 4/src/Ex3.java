import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

		final int TAM=4;
		int[] notas = new int [TAM];
		int media= 0;
		
		for (int i=0;i<TAM;i++){
			System.out.println("Digite uma nota");
			notas[i]= entrada.nextInt();
			media= notas[i]+media;
		}
		
		for (int i=0; i<TAM; i++){
			System.out.print(notas[i]+" ");
			
			}
		System.out.println("A média é: "+ media/4);
			entrada.close();


	}

}
