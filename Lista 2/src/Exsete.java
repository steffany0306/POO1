import java.util.Scanner;

public class Exsete {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

		System.out.println("Digite três números");
		double num1= entrada.nextDouble();
		double num2= entrada.nextDouble();
		double num3= entrada.nextDouble();
		

if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
 System.out.println(num2 + ", "+ num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 >= num2) {

System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }

entrada.close();

		
	}

}
