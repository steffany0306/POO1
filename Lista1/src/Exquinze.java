import java.util.Scanner;
public class Exquinze {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);	

		System.out.println("Quantos metros quadrados você precisa pintar?");
		int totalMetros=  entrada.nextInt();
		
		double litrosNecessarios = totalMetros / 3;
		
		double latas = litrosNecessarios/18;
		
		double preco = latas*80;
		
		System.out.println("O preço total a pagar é " + preco);
		System.out.println("Você ira usar " + latas +" latas de tinta");
		
		entrada.close();
	}

}
