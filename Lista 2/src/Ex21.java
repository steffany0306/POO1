import java.util.Scanner;

public class Ex21{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = entrada.nextInt();

        System.out.print("Digite o mês: ");
        int mes = entrada.nextInt();

        System.out.print("Digite o ano: ");
        int ano = entrada.nextInt();

        boolean dataValida = true;

        
        if (mes < 1 || mes > 12) {
            dataValida = false;
        } else {
            if (dia < 1) {
                dataValida = false;
            } else if (mes == 2) {
                boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                if (bissexto && dia > 29) {
                    dataValida = false;
                } else if (!bissexto && dia > 28) {
                    dataValida = false;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia > 30) {
                    dataValida = false;
                }
            } else {
                if (dia > 31) {
                    dataValida = false;
                }
            }
        }

        if (dataValida) {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida.");
        } else {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é inválida.");
        }

        entrada.close();
    }
}
