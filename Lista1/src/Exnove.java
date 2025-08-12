import java.util.Scanner;
public class Exnove {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
			System.out.println("Qual a tempratura em Farenheit?");
			int temp = entrada.nextInt();
			
			int result= temp-32;
			
			System.out.println("A temperatura "+ temp + " F em graus Celsius é "+ result/1.8);
		entrada.close();
	}

}
