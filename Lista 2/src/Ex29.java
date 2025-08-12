import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int respostasPositivas = 0;

        System.out.print("Telefonou para a vítima? (s/n): ");
        if (entrada.next().equalsIgnoreCase("s")) respostasPositivas++;

        System.out.print("Esteve no local do crime? (s/n): ");
        if (entrada.next().equalsIgnoreCase("s")) respostasPositivas++;

        System.out.print("Mora perto da vítima? (s/n): ");
        if (entrada.next().equalsIgnoreCase("s")) respostasPositivas++;

        System.out.print("Devia para a vítima? (s/n): ");
        if (entrada.next().equalsIgnoreCase("s")) respostasPositivas++;

        System.out.print("Já trabalhou com a vítima? (s/n): ");
        if (entrada.next().equalsIgnoreCase("s")) respostasPositivas++;

        System.out.println("Classificação:");
        switch (respostasPositivas) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
        }

       entrada.close();
    }
}
