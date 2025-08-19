public class Ex15 {
    public static void main(String[] args) {
        double soma = 0;

        System.out.println("S = ");

        for (int i = 1; i <= 37; i++) {
            int a = 38 - i;
            int b = 37 - i;
            double termo = (double)(a * b) / i;
            soma += termo;

            System.out.println("(" + (a * b) + ")/" + i);
            if (i < 37) {
                System.out.print(" + ");
            }
        }

        System.out.println("Soma da série S = " + soma);
    }
}
