import java.util.Scanner;
public class Excinco {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
	
System.out.println("Digite uma letra maiúscula");
char letra = entrada.next().toUpperCase().charAt(0);



if (letra == 'A' || 'E'||'I'||'O'||'U') {
    System.out.println("F - Feminino");
} else if (letra == 'M') {
    System.out.println("M - Masculino");
} else {
    System.out.println("Digite apenas F ou M.");
}
entrada.close();

		
	}

}
