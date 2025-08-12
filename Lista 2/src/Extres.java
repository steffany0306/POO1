import java.util.Scanner;
public class Extres {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite F (para feminino) ou M (para masculino)");
		String letra = entrada.nextLine().toUpperCase();		
		

if (letra.equals("F")) {
            System.out.println("F - Feminino");
        } else if (letra.equals("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Digite apenas F ou M.");
        }
entrada.close();
	}

}
