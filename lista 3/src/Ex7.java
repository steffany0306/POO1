import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dois números, o segundo maior que o primeiro");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		

		int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Os números entre " + num1 + " e " + num2);
        
			for (int i = menor + 1; i < maior; i++) {
            System.out.println(i);
				}		
		
		entrada.close();
	}

}
