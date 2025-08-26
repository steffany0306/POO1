import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);


	final int TAM = 5;
	int[] numero= new int[TAM];
	int soma=0;
	int mult=1;
	
	for (int i= 0;i<TAM;i++) {
		System.out.println("Digite um número");
		numero[i]= entrada.nextInt();
		soma=soma+numero[i];
		mult=mult*numero[i];
	}
		
	System.out.println("A soma dos números é: "+ soma);
	System.out.println("A multiplicação dos números é: "+ mult);
	System.out.println("Os números foram: ");
	for (int i = 0; i < TAM; i++) {
            System.out.print(numero[i] + " ");
	}

	entrada.close();
	}

}
