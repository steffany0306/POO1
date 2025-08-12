import java.util.Scanner;
public class Exseis {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);		
		System.out.println("digite um número inteiro");
		int num = entrada.nextInt();
		
		if (num% 2 == 0) {
		num+=1;
		System.out.println("o número era par e agora ficou ímpar: " + num);
		} else {
			num-=1;
			System.out.println("o número era ímpar e agora é par: " + num);
	
		}
		
		entrada.close();
		}

}
