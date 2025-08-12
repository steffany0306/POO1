import java.util.Scanner;
public class Exquatorze {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Quantas horas você trabalha por mês?");
		int horas= entrada.nextInt();
		
		System.out.println("Quanto você ganha por hora?");
		int valor= entrada.nextInt();

		double bruto = horas * valor;
        double IR = bruto * 0.11;   
        double INSS = bruto * 0.08; 
        double sind = bruto * 0.05; 
        double totalDescontos = IR + INSS + sind;
        double liquid = bruto - totalDescontos;

		System.out.println("+ Salário bruto: R$ " + bruto);
		System.out.println("- IR(11%): R$ " + IR);
		System.out.println("- INSS(8%): R$ " + INSS);
		System.out.println("- Sindicato(5%): R$ " + sind);
		System.out.println("= Salário líquido: R$ " + liquid);
		
		entrada.close();
	}

}
