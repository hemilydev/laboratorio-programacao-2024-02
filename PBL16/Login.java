package com.cadastro;

import java.io.*;
import java.util.*;

public class Login {
  
	private static final String FILE_PATH = "src/com/cadastro/usuarios.txt"; // Alterar o endereço de onde for salvar o arquivo.

    public boolean realizarLogin(String email, String senha) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados[1].equals(email) && dados[2].equals(senha)) {
                    System.out.println("Login bem-sucedido. Bem-vindo(a), " + dados[0] + "!");
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao acessar o arquivo: " + e.getMessage());
        }
        System.out.println("E-mail ou senha inválidos.");
        return false;
    }

    public void recuperarSenha(String email) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados[1].equals(email)) {
                    System.out.println("Senha do usuário: " + dados[2]);
                    return;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao acessar o arquivo: " + e.getMessage());
        }
        System.out.println("E-mail não encontrado.");
    }

    public void alterarSenha(String email, String novaSenha) {
        List<String> linhas = new ArrayList<>();
        boolean encontrado = false;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados[1].equals(email)) {
                    dados[2] = novaSenha;
                    encontrado = true;
                    System.out.println("Senha alterada com sucesso.");
                }
                linhas.add(String.join(";", dados));
            }
        } catch (IOException e) {
            System.err.println("Erro ao acessar o arquivo: " + e.getMessage());
        }

        if (encontrado) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
                for (String linha : linhas) {
                    bw.write(linha);
                    bw.newLine();
                }
            } catch (IOException e) {
                System.err.println("Erro ao salvar as alterações: " + e.getMessage());
            }
        } else {
            System.out.println("E-mail não encontrado.");
        }
    }
}
