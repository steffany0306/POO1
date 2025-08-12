import java.util.Scanner;
public class Exdezessete {

	public static void main(String[] args) {
Scanner entrada= new Scanner(System.in);

System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;
        String conceito;
        String status;

        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
            status = "APROVADO";
        } else if (media >= 7.5) {
            conceito = "B";
            status = "APROVADO";
        } else if (media >= 6.0) {
            conceito = "C";
            status = "APROVADO";
        } else if (media >= 4.0) {
            conceito = "D";
            status = "REPROVADO";
        } else {
            conceito = "E";
            status = "REPROVADO";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + status);

        entrada.close();
    }
}
