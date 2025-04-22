import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Arrays e listas de dados
    static String[] meses = {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    static String[] nomesCategorias = {
        "Alimentação", "Transporte", "Lazer", "Educação", "Saúde",
        "Moradia", "Roupas", "Viagem", "Tecnologia", "Serviços",
        "Hobbies", "Outros"
    };

    static List<Pessoa> pessoas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o inteiro
            executarOpcao(opcao);
        } while (opcao != 7);
    }

    // Exibir menu
    public static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Adicionar Pessoa");
        System.out.println("2. Adicionar Despesa");
        System.out.println("3. Consultar Despesa por Categoria");
        System.out.println("4. Consultar Despesa por Mês");
        System.out.println("5. Consultar Total de uma Categoria para Todas as Pessoas");
        System.out.println("6. Consultar Total Geral de Todas as Despesas");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Executar ação conforme a opção
    public static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                adicionarPessoa();
                break;
            case 2:
                adicionarDespesa();
                break;
            case 3:
                consultarDespesaCategoria();
                break;
            case 4:
                consultarDespesaMes();
                break;
            case 5:
                consultarTotalCategoriaTodasPessoas();
                break;
            case 6:
                consultarTotalGeralTodasDespesas();
                break;
            case 7:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    // Função para adicionar pessoa
    public static void adicionarPessoa() {
        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();
        Pessoa novaPessoa = new Pessoa(nomePessoa);
        pessoas.add(novaPessoa);
        System.out.println("Pessoa " + nomePessoa + " adicionada com sucesso!");
    }

    // Função para adicionar despesa
    public static void adicionarDespesa() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa registrada. Adicione uma pessoa primeiro.");
            return;
        }

        System.out.println("Escolha a pessoa:");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + ". " + pessoas.get(i).nome);
        }
        int pessoaIndex = scanner.nextInt() - 1;

        System.out.println("Escolha a categoria:");
        for (int i = 0; i < nomesCategorias.length; i++) {
            System.out.println((i + 1) + ". " + nomesCategorias[i]);
        }
        int categoriaIndex = scanner.nextInt() - 1;

        System.out.print("Digite o mês (1 a 12): ");
        int mesIndex = scanner.nextInt() - 1;

        System.out.print("Digite o valor da despesa: ");
        double valor = scanner.nextDouble();

        Pessoa pessoa = pessoas.get(pessoaIndex);
        pessoa.despesasPorCategoria.get(categoriaIndex)[mesIndex] += valor;
        System.out.println("Despesa adicionada com sucesso!");
    }

    // Consultar despesa por categoria
    public static void consultarDespesaCategoria() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa registrada. Adicione uma pessoa primeiro.");
            return;
        }

        System.out.println("Escolha a pessoa:");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + ". " + pessoas.get(i).nome);
        }
        int pessoaIndex = scanner.nextInt() - 1;

        System.out.println("Escolha a categoria:");
        for (int i = 0; i < nomesCategorias.length; i++) {
            System.out.println((i + 1) + ". " + nomesCategorias[i]);
        }
        int categoriaIndex = scanner.nextInt() - 1;

        double total = 0;
        Pessoa pessoa = pessoas.get(pessoaIndex);
        double[] categoria = pessoa.despesasPorCategoria.get(categoriaIndex);
        for (double despesa : categoria) {
            total += despesa;
        }

        System.out.println("Total de despesas na categoria " + nomesCategorias[categoriaIndex] +
                           " da pessoa " + pessoas.get(pessoaIndex).nome + ": R$ " + total);
    }

    // Consultar despesa por mês
    public static void consultarDespesaMes() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa registrada. Adicione uma pessoa primeiro.");
            return;
        }

        System.out.println("Escolha a pessoa:");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + ". " + pessoas.get(i).nome);
        }
        int pessoaIndex = scanner.nextInt() - 1;

        System.out.print("Digite o mês (1 a 12): ");
        int mesIndex = scanner.nextInt() - 1;

        double totalMes = 0;
        Pessoa pessoa = pessoas.get(pessoaIndex);

        System.out.println("Despesas no mês " + meses[mesIndex] + " da pessoa " + pessoas.get(pessoaIndex).nome + ":");
        for (int categoriaIndex = 0; categoriaIndex < nomesCategorias.length; categoriaIndex++) {
            double despesa = pessoa.despesasPorCategoria.get(categoriaIndex)[mesIndex];
            System.out.printf("- %s: R$ %.2f\n", nomesCategorias[categoriaIndex], despesa);
            totalMes += despesa;
        }

        System.out.println("Total de despesas no mês " + meses[mesIndex] + ": R$ " + totalMes);
    }

    // Consultar total de uma categoria para todas as pessoas
    public static void consultarTotalCategoriaTodasPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa registrada. Adicione uma pessoa primeiro.");
            return;
        }

        System.out.println("Escolha a categoria:");
        for (int i = 0; i < nomesCategorias.length; i++) {
            System.out.println((i + 1) + ". " + nomesCategorias[i]);
        }
        int categoriaIndex = scanner.nextInt() - 1;

        double totalCategoria = 0;
        for (Pessoa pessoa : pessoas) {
            double[] categoria = pessoa.despesasPorCategoria.get(categoriaIndex);
            for (double despesa : categoria) {
                totalCategoria += despesa;
            }
        }

        System.out.println("Total de despesas na categoria " + nomesCategorias[categoriaIndex] +
                           " para todas as pessoas: R$ " + totalCategoria);
    }

    // Consultar total geral de todas as despesas
    public static void consultarTotalGeralTodasDespesas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa registrada. Adicione uma pessoa primeiro.");
            return;
        }

        double totalGeral = 0;
        for (Pessoa pessoa : pessoas) {
            for (double[] categoria : pessoa.despesasPorCategoria) {
                for (double despesa : categoria) {
                    totalGeral += despesa;
                }
            }
        }

        System.out.println("Total de todas as despesas de todas as pessoas em todos os meses: R$ " + totalGeral);
    }

    // Classe Pessoa
    static class Pessoa {
        String nome;
        List<double[]> despesasPorCategoria;

        public Pessoa(String nome) {
            this.nome = nome;
            this.despesasPorCategoria = new ArrayList<>();
            for (int i = 0; i < nomesCategorias.length; i++) {
                despesasPorCategoria.add(new double[12]); // Inicializa despesas por categoria e mês
            }
        }
    }
}
