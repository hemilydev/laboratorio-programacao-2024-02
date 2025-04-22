package com.cadastro;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cadastro {
  
    private List<Usuario> usuarios;
    private int proximoId;

    public Cadastro() {
        usuarios = new ArrayList<>();
        proximoId = 1;
    }

    public void inserirUsuario(String nome, String email) {
        Usuario usuario = new Usuario(proximoId, nome, email);
        usuarios.add(usuario);
        proximoId++;
        System.out.println("Usuário inserido com sucesso.");
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    public void lerUsuario(int id) {
        Optional<Usuario> usuarioOpt = usuarios.stream().filter(u -> u.getId() == id).findFirst();
        if (usuarioOpt.isPresent()) {
            System.out.println(usuarioOpt.get());
        } else {
            System.out.println("Usuário com ID " + id + " não encontrado.");
        }
    }

    public void atualizarUsuario(int id, String nome, String email) {
        Optional<Usuario> usuarioOpt = usuarios.stream().filter(u -> u.getId() == id).findFirst();
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            usuario.setNome(nome);
            usuario.setEmail(email);
            System.out.println("Usuário atualizado com sucesso.");
        } else {
            System.out.println("Usuário com ID " + id + " não encontrado.");
        }
    }

    public void excluirUsuario(int id) {
        Optional<Usuario> usuarioOpt = usuarios.stream().filter(u -> u.getId() == id).findFirst();
        if (usuarioOpt.isPresent()) {
            usuarios.remove(usuarioOpt.get());
            System.out.println("Usuário removido com sucesso.");
        } else {
            System.out.println("Usuário com ID " + id + " não encontrado.");
        }
    }
}
