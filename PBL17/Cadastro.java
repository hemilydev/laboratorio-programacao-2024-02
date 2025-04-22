import java.io.*;
import java.util.*;

public class Cadastro {

    // Classe interna para representar um usuário
    static class Usuario {
        int id;
        String nome;
        String email;
        String senha;

        public Usuario(int id, String nome, String email, String senha) {
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.senha = senha;
        }

        @Override
        public String toString() {
            return id + ";" + nome + ";" + email + ";" + senha; // Formato para salvar no arquivo
        }

        // Construtor para carregar dados do arquivo
        public static Usuario fromString(String linha) {
            String[] partes = linha.split(";");
            
            // Verifica se a linha tem exatamente 4 partes
            if (partes.length != 4) {
                System.out.println("Linha inválida no arquivo de dados: " + linha);
                return null;  // Retorna null se a linha não for válida
            }
            
            try {
                int id = Integer.parseInt(partes[0]);  // Converte o ID para um número
                String nome = partes[1];
                String email = partes[2];
                String senha = partes[3];
                return new Usuario(id, nome, email, senha);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao processar dados (ID inválido): " + e.getMessage());
                return null;  // Retorna null se o ID não for um número válido
            }
        }
    }

    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static int proximoId = 1; // Gerador de ID automático
    private static final String ARQUIVO = "C:/Users/Admin/Downloads/vs code/usuarios.txt"; // Caminho do arquivo

    public static void main(String[] args) {
        carregarDados(); // Carregar dados do arquivo ao iniciar
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Ler Dados de um Usuário");
            System.out.println("4. Atualizar Usuário");
            System.out.println("5. Excluir Usuário");
            System.out.println("6. Login");
            System.out.println("7. Recuperação de Senha");
            System.out.println("8. Alteração de Senha");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarUsuario(scanner);
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 3:
                    lerUsuario(scanner);
                    break;
                case 4:
                    atualizarUsuario(scanner);
                    break;
                case 5:
                    excluirUsuario(scanner);
                    break;
                case 6:
                    login(scanner);
                    break;
                case 7:
                    recuperarSenha(scanner);
                    break;
                case 8:
                    alterarSenha(scanner);
                    break;
                case 0:
                    salvarDados(); // Salvar dados ao encerrar
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void salvarDados() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Usuario usuario : usuarios) {
                writer.write(usuario.toString());
                writer.newLine();  // Adiciona uma nova linha para separar os usuários
            }
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    private static void carregarDados() {
        File arquivo = new File(ARQUIVO);
        
        // Cria o arquivo se ele não existir
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
                System.out.println("Arquivo criado: " + ARQUIVO);
            } catch (IOException e) {
                System.out.println("Erro ao criar arquivo: " + e.getMessage());
            }
        }

        // Lê o arquivo de dados
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println("Linha lida do arquivo: " + linha);  // Depuração
                // Chama o fromString para criar o usuário
                Usuario usuario = Usuario.fromString(linha);
                
                // Só adiciona à lista de usuários se o retorno não for null (linha válida)
                if (usuario != null) {
                    usuarios.add(usuario);
                    // Atualiza o próximo ID
                    proximoId = Math.max(proximoId, usuario.id + 1);
                } else {
                    System.out.println("Linha ignorada: " + linha);  // Caso a linha seja inválida
                }
            }
            System.out.println("Dados carregados com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de dados não encontrado. Iniciando com lista vazia.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }

    private static void criarUsuario(Scanner scanner) {
        System.out.print("Digite o nome do usuário: ");
        scanner.nextLine(); // Limpa o buffer
        String nome = scanner.nextLine();
        System.out.print("Digite o email do usuário: ");
        String email = scanner.nextLine();
        System.out.print("Digite a senha do usuário: ");
        String senha = scanner.nextLine();
    
        // Criptografa a senha
        String senhaCriptografada = Criptografia.criptografar(senha);
    
        Usuario usuario = new Usuario(proximoId++, nome, email, senhaCriptografada);
        usuarios.add(usuario);
        System.out.println("Usuário inserido com sucesso!");
    }

    private static void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("\nLista de Usuários:");
            for (Usuario usuario : usuarios) {
                System.out.println("ID: " + usuario.id + ", Nome: " + usuario.nome + ", Email: " + usuario.email);
            }
        }
    }

    private static void lerUsuario(Scanner scanner) {
        System.out.print("Digite o ID do usuário que deseja ler: ");
        int id = scanner.nextInt();
        Usuario usuario = encontrarUsuarioPorId(id);

        if (usuario != null) {
            System.out.println("ID: " + usuario.id + ", Nome: " + usuario.nome + ", Email: " + usuario.email);
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    private static void atualizarUsuario(Scanner scanner) {
        System.out.print("Digite o ID do usuário que deseja atualizar: ");
        int id = scanner.nextInt();
        Usuario usuario = encontrarUsuarioPorId(id);

        if (usuario != null) {
            System.out.print("Digite o novo nome: ");
            scanner.nextLine(); // Limpa o buffer
            String nome = scanner.nextLine();
            System.out.print("Digite o novo email: ");
            String email = scanner.nextLine();

            usuario.nome = nome;
            usuario.email = email;
            System.out.println("Usuário atualizado com sucesso!");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    private static void excluirUsuario(Scanner scanner) {
        System.out.print("Digite o ID do usuário que deseja excluir: ");
        int id = scanner.nextInt();
        Usuario usuario = encontrarUsuarioPorId(id);

        if (usuario != null) {
            usuarios.remove(usuario);
            System.out.println("Usuário excluído com sucesso!");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    private static void login(Scanner scanner) {
        System.out.print("Digite seu email: ");
        scanner.nextLine(); // Limpa o buffer
        String email = scanner.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();
    
        for (Usuario usuario : usuarios) {
            if (usuario.email.equals(email)) {
                // Decriptografa a senha do usuário
                String senhaDecriptografada = Criptografia.decriptografar(usuario.senha);
                
                if (senhaDecriptografada.equals(senha)) {
                    System.out.println("Login bem-sucedido! Bem-vindo(a), " + usuario.nome);
                    return;
                }
            }
        }
        System.out.println("Email ou senha incorretos.");
    }

    private static void recuperarSenha(Scanner scanner) {
        System.out.print("Digite o email do usuário: ");
        scanner.nextLine(); // Limpa o buffer
        String email = scanner.nextLine();
    
        for (Usuario usuario : usuarios) {
            if (usuario.email.equals(email)) {
                // Decriptografa a senha
                String senhaDecriptografada = Criptografia.decriptografar(usuario.senha);
                System.out.println("Sua senha é: " + senhaDecriptografada);
                return;
            }
        }
        System.out.println("Email não encontrado.");
    }
    

    private static void alterarSenha(Scanner scanner) {
        System.out.print("Digite o email do usuário: ");
        scanner.nextLine(); // Limpa o buffer
        String email = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.email.equals(email)) {
                System.out.print("Digite a nova senha: ");
                String novaSenha = scanner.nextLine();
                usuario.senha = Criptografia.criptografar(novaSenha); // Criptografa a nova senha
                System.out.println("Senha alterada com sucesso!");
                return;
            }
        }
        System.out.println("Email não encontrado.");
    }

    private static Usuario encontrarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.id == id) {
                return usuario;
            }
        }
        return null;
    }
}

class Criptografia {

    // Método para criptografar a senha
    public static String criptografar(String senhaOriginal) {
        StringBuilder senhaCriptografada = new StringBuilder();

        // Adiciona os dois primeiros caracteres com o tamanho da senha
        senhaCriptografada.append(String.format("%02d", senhaOriginal.length()));

        // Gera a sequência de Fibonacci até a posição maior que o tamanho da senha
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(2);
        
        // Preenche a lista de Fibonacci
        while (fibonacci.get(fibonacci.size() - 1) < senhaOriginal.length()) {
            int next = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(next);
        }

        // Coloca caracteres aleatórios nas posições da sequência de Fibonacci
        Random random = new Random();
        for (int i = 0; i < fibonacci.size(); i++) {
            int pos = fibonacci.get(i) - 1; // Fibonacci começa de 1, mas a string é baseada em índice 0
            if (pos < senhaOriginal.length()) {
                senhaCriptografada.insert(pos, random.nextInt(10)); // Adiciona números aleatórios
            }
        }

        // Adiciona a senha original nas posições restantes
        for (int i = 0; i < senhaOriginal.length(); i++) {
            if (senhaCriptografada.charAt(i) == ' ') {
                senhaCriptografada.setCharAt(i, senhaOriginal.charAt(i));
            }
        }

        return senhaCriptografada.toString();
    }

    // Método para decriptografar a senha
    public static String decriptografar(String senhaCriptografada) {
        // Remove os dois primeiros caracteres, que indicam o tamanho da senha
        int tamanhoSenha = Integer.parseInt(senhaCriptografada.substring(0, 2));
        StringBuilder senhaOriginal = new StringBuilder();

        // Preenche a senha original apenas com os caracteres que não são aleatórios
        int index = 2;  // Começa a buscar após os dois primeiros caracteres (tamanho da senha)
        while (senhaOriginal.length() < tamanhoSenha) {
            if (index >= senhaCriptografada.length() || Character.isDigit(senhaCriptografada.charAt(index))) {
                // Avança para o próximo caractere
                index++;
            } else {
                // Adiciona os caracteres da senha original
                senhaOriginal.append(senhaCriptografada.charAt(index));
                index++;
            }
        }

        return senhaOriginal.toString();
    }
}
