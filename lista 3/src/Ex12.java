import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i = 0;
        int a = 1, b = 1, temp;

        System.out.print("Digite o número de termos da série de Fibonacci: ");
        n = scanner.nextInt();

        System.out.println("Série de Fibonacci com " + n + " termos:");

        do {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
            i++;
        } while (i < n);

        scanner.close();
    }
}
