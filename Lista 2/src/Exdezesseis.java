import java.util.Scanner;

public class Exdezesseis {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Escreva sua primeira nota");
   	int nota1 = entrada.nextInt();
   	System.out.println("Escreva sua segunda nota");
   	int nota2 = entrada.nextInt();
   	
   	var media = nota1 + nota2;
   	
   	if (media/2 == 0 || media/2<=3) {
   		System.out.println("Reprovado");
   	}
   	else if (media/2 > 3 || media/2 <=6.9) {
   	System.out.println("Em Exame");
   	}
   	else if(media/2 > 7 || media/2 <= 10) {
   	System.out.println("Aprovado");
   	}
        entrada.close();
    }
}
