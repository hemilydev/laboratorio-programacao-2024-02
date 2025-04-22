import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Credenciais válidas
        final String USERNAME_VALIDO = "usuario123";
        final String CPF_VALIDO = "11111111111";
        final String TELEFONE_VALIDO = "5562999998888";
        final String SENHA_VALIDO = "senhaSegura";
 
        // Solicita ao usuário o tipo de credencial
        System.out.println("Escolha o tipo de credencial para login:");
        System.out.println("1. Username");
        System.out.println("2. CPF");
        System.out.println("3. Telefone");
        System.out.print("Digite o número correspondente: ");
        int tipoCredencial = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha após a leitura do inteiro
 
        // Solicita a credencial e a senha
        System.out.print("Digite a credencial: ");
        String credencial = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
 
        // Verificação das credenciais
        if (tipoCredencial == 1) {  // Username
            if (credencial.equals(USERNAME_VALIDO)) {
                if (senha.equals(SENHA_VALIDO)) {
                    System.out.println("Login bem-sucedido! Bem-vindo, Username.");
                } else {
                    System.out.println("Senha incorreta.");
                    }
            } else {
                System.out.println("Username incorreto.");
            }
        } else if (tipoCredencial == 2) {  // CPF
            if (credencial.equals(CPF_VALIDO) && credencial.length() == 11) {
                if (senha.equals(SENHA_VALIDO)) {
                    System.out.println("Login bem-sucedido! Bem-vindo, CPF.");
                } else {
                    System.out.println("Senha incorreta.");
                }
            } else {
                System.out.println("CPF incorreto.");
            }
        } else if (tipoCredencial == 3) {  // Telefone
            if (credencial.equals(TELEFONE_VALIDO) && credencial.length() == 13) {
                if (senha.equals(SENHA_VALIDO)) {
                    System.out.println("Login bem-sucedido! Bem-vindo, Telefone.");
                } else {
                    System.out.println("Senha incorreta.");
                }
            } else {
                System.out.println("Telefone incorreto.");
            }
        } else {
            System.out.println("Tipo de credencial inválido.");
        }
 
        scanner.close();
    }
}
