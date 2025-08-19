import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
	String nome;
	int idade;
	double salario;
	char sexo;
	char estado;
	
		do {
			System.out.println("Escreva seu nome: ");
			nome = entrada.nextLine();
			if (nome.length()<=3) {
				System.out.println("Nome inválido. Escreva um nome com no mínimo três caracteres");
			}
			
		} while (nome.length()<=3);
		
		do {
			System.out.println("Escreva sua idade: ");
			idade = entrada.nextInt();		
			if (idade<0 || idade>150){
				System.out.println("Idade inválida. Digite uma idade entre 0 e 150");
			}
	} while (idade<0 || idade>150);
		
		do {
			System.out.println("Escreva seu salário: ");
			salario = entrada.nextDouble();
			if (salario<0) {
				System.out.println("Salário inválido. Digite um salário maior que 0");
			}
			
		}while (salario<0);
		
		do {
			System.out.println("Escreva seu sexo: ");
			sexo=entrada.next().toLowerCase().charAt(0);
			if (sexo !='f' && sexo !='m') {
				System.out.println("Sexo inválido. Digite m ou f");
			}
			
		}while (sexo !='f' && sexo !='m');
		

		do {
			System.out.println("Escreva seu estado civil ('s' solteiro, 'c' casado, 'v' viúvo, 'd' divorciado)");
			estado=entrada.next().toLowerCase().charAt(0);
			if (estado!='s' && estado!='c' &&  estado!='v' &&estado!='d' ) {
				System.out.println("Estado Civil inválido. Tente novamente");
			}
			
		}while (estado!='s' && estado!='c' &&  estado!='v' &&estado!='d');
		
		System.out.println("Informações válidas");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estado);
		
		entrada.close();
   }
}
