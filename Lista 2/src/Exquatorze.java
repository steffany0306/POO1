import java.util.Scanner;
public class Exquatorze {

	public static void main(String[] args) {

		        Scanner entrada = new Scanner(System.in);

		        System.out.print("Digite um número de 1 a 7: ");
		        int dia = entrada.nextInt();

		        switch (dia) {
		            case 1:
		                System.out.println("Domingo");
		                break;
		            case 2:
		                System.out.println("Segunda-feira");
		                break;
		            case 3:
		                System.out.println("Terça-feira");
		                break;
		            case 4:
		                System.out.println("Quarta-feira");
		                break;
		            case 5:
		                System.out.println("Quinta-feira");
		                break;
		            case 6:
		                System.out.println("Sexta-feira");
		                break;
		            case 7:
		                System.out.println("Sábado");
		                break;
		            default:
		                System.out.println("Valor inválido. Digite um número entre 1 e 7.");
		        }

		        entrada.close();
		    }
		}

