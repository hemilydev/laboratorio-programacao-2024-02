package com.cadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Realizar Login");
            System.out.println("2 - Recuperar Senha");
            System.out.println("3 - Alterar Senha");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite seu e-mail: ");
                    String loginEmail = scanner.nextLine();
                    System.out.print("Digite sua senha: ");
                    String loginSenha = scanner.nextLine();
                    login.realizarLogin(loginEmail, loginSenha);
                    break;

                case 2:
                    System.out.print("Digite seu e-mail para recuperar a senha: ");
                    String emailRecuperar = scanner.nextLine();
                    login.recuperarSenha(emailRecuperar);
                    break;

                case 3:
                    System.out.print("Digite seu e-mail para alterar a senha: ");
                    String emailAlterar = scanner.nextLine();
                    System.out.print("Digite a nova senha: ");
                    String novaSenha = scanner.nextLine();
                    login.alterarSenha(emailAlterar, novaSenha);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
