import java.util.Scanner;
public class Exdez {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
			
		System.out.println("Digite dois números inteiros e um número real");
		int num1= entrada.nextInt();
		int num2= entrada.nextInt();
		Float num3= entrada.nextFloat();
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é "+ (num1+num1)*num2);
		System.out.println("A soma do triplo do primeiro com o terceiro é "+ (num1+num1+num1)+num3);
		System.out.println("O terceiro elevado ao cubo é "+ num3*num3*num3);
		
		entrada.close();
	}

}
