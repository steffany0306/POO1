import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.println(num++);
		}while (num!=21);
		
		int num2=0;
		do {
			System.out.print((num2++)+ " ");
		}while (num2!=21);
		
		entrada.close();
		
	}

}
