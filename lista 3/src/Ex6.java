import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num=1;
		do {

			if (num % 2 != 0) {
                System.out.println(num);
			}
			num++;
		}while (num<=50);
		
		entrada.close();
	}

}
