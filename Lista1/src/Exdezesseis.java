import java.util.Scanner;

public class Exdezesseis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);	

		System.out.println("Quantos metros quadrados você precisa pintar?");
		int totalMetros=  entrada.nextInt();
		
		double litrosNecessarios = totalMetros / 6;
		
		double latas = litrosNecessarios/18;
		
		double preco = latas*80;
		
		double latas2= litrosNecessarios/3.6;
		
		double preco2 = latas*25;
		
		System.out.println("O preço total a pagar é " + preco + " por latas de 18 litros");
		System.out.println("Você irá usar " + latas +" latas de tinta de 18 litros");
		

		System.out.println("O preço total a pagar é " + preco2 + " por latas de 3.6 litros");
		System.out.println("Você irá usar " + latas2 +" latas de tinta de 3.6 litros");
		
		
		entrada.close();

	}

}
