
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String senha;

        while (true) {
            System.out.println("Digite o nome de usuário: ");
            usuario = entrada.nextLine();

            System.out.println("Digite a senha: ");
            senha = entrada.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("A senha não pode ser igual ao nome de usuário.");
            } else {
                System.out.println("Cadastro realizado com sucesso!");
                break;
            }
        }

        entrada.close();
    }
}
