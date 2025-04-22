import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definição das credenciais válidas
        final String USERNAME = "usuario123";
        final String CPF = "11111111111";
        final String TELEFONE = "5562999998888";
        final String SENHA = "senhaSegura";

        // Solicitação das credenciais
        System.out.println("Escolha uma das opções para login: ");
        System.out.println("1. Username");
        System.out.println("2. CPF");
        System.out.println("3. Telefone");
        System.out.print("Digite o número correspondente: ");
        int tipoCredencial = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite a credencial: ");
        String credencial = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        // Validação das credenciais com if-else aninhados
        if (tipoCredencial == 1) { // Username
            if (credencial.equals(USERNAME) && senha.equals(SENHA)) {
                System.out.println("Login bem-sucedido! Bem-vindo, Username.");
            } else {
                System.out.println("Username ou senha incorretos.");
            }
        } else if (tipoCredencial == 2) { // CPF
            if (credencial.equals(CPF) && credencial.length() == 11 && senha.equals(SENHA)) {
                System.out.println("Login bem-sucedido! Bem-vindo, CPF.");
            } else {
                System.out.println("CPF ou senha incorretos.");
            }
        } else if (tipoCredencial == 3) { // Telefone
            if (credencial.equals(TELEFONE) && credencial.length() == 13 && senha.equals(SENHA)) {
                System.out.println("Login bem-sucedido! Bem-vindo, Telefone.");
            } else {
                System.out.println("Telefone ou senha incorretos.");
            }
        } else {
            System.out.println("Tipo de credencial inválido.");
        }
      
        scanner.close();
    }
}
