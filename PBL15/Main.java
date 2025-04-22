package com.cadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Ler dados de um usuário");
            System.out.println("4. Atualizar usuário");
            System.out.println("5. Excluir usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o email do usuário: ");
                    String email = scanner.nextLine();
                    cadastro.inserirUsuario(nome, email);
                    break;
                case 2:
                    System.out.println("Lista de usuários:");
                    cadastro.listarUsuarios();
                    break;
                case 3:
                    System.out.print("Digite o ID do usuário: ");
                    int idLer = scanner.nextInt();
                    cadastro.lerUsuario(idLer);
                    break;
                case 4:
                    System.out.print("Digite o ID do usuário para atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo email: ");
                    String novoEmail = scanner.nextLine();
                    cadastro.atualizarUsuario(idAtualizar, novoNome, novoEmail);
                    break;
                case 5:
                    System.out.print("Digite o ID do usuário para excluir: ");
                    int idExcluir = scanner.nextInt();
                    cadastro.excluirUsuario(idExcluir);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
