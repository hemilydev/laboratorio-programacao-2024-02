import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        String[] nomesCategorias = {
            "Alimentação", "Transporte", "Lazer", "Educação", "Saúde",
            "Moradia", "Roupas", "Viagem", "Tecnologia", "Serviços",
            "Hobbies", "Outros"
        };

        List<List<double[]>> pessoas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Pessoa");
            System.out.println("2. Adicionar Despesa");
            System.out.println("3. Consultar Despesa por Categoria");
            System.out.println("4. Consultar Despesa por Mês");
            System.out.println("5. Consultar Total de uma Categoria para Todas as Pessoas");
            System.out.println("6. Consultar Total Geral de Todas as Despesas");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nomePessoa = scanner.nextLine();
                    List<double[]> categoriasDespesa = new ArrayList<>();
                    for (int i = 0; i < nomesCategorias.length; i++) {
                        categoriasDespesa.add(new double[12]);
                    }
                    pessoas.add(categoriasDespesa);
                    System.out.println("Pessoa " + nomePessoa + " adicionada com sucesso!");
                    break;

                case 2:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa registrada. Adicione uma pessoa primeiro.");
                    } else {
                        System.out.println("Escolha a pessoa:");
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println((i + 1) + ". Pessoa " + (i + 1));
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

                        List<double[]> pessoa = pessoas.get(pessoaIndex);
                        pessoa.get(categoriaIndex)[mesIndex] += valor;
                        System.out.println("Despesa adicionada com sucesso!");
                    }
                    break;

                case 3:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa registrada. Adicione uma pessoa primeiro.");
                    } else {
                        System.out.println("Escolha a pessoa:");
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println((i + 1) + ". Pessoa " + (i + 1));
                        }
                        int pessoaIndex = scanner.nextInt() - 1;

                        System.out.println("Escolha a categoria:");
                        for (int i = 0; i < nomesCategorias.length; i++) {
                            System.out.println((i + 1) + ". " + nomesCategorias[i]);
                        }
                        int categoriaIndex = scanner.nextInt() - 1;

                        double total = 0;
                        List<double[]> pessoa = pessoas.get(pessoaIndex);
                        double[] categoria = pessoa.get(categoriaIndex);
                        for (double despesa : categoria) {
                            total += despesa;
                        }

                        System.out.println("Total de despesas na categoria " + nomesCategorias[categoriaIndex] +
                                           " da pessoa " + (pessoaIndex + 1) + ": R$ " + total);
                    }
                    break;

                case 4:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa registrada. Adicione uma pessoa primeiro.");
                    } else {
                        System.out.println("Escolha a pessoa:");
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println((i + 1) + ". Pessoa " + (i + 1));
                        }
                        int pessoaIndex = scanner.nextInt() - 1;

                        System.out.print("Digite o mês (1 a 12): ");
                        int mesIndex = scanner.nextInt() - 1;

                        double totalMes = 0;
                        List<double[]> pessoa = pessoas.get(pessoaIndex);

                        System.out.println("Despesas no mês " + meses[mesIndex] + " da pessoa " + (pessoaIndex + 1) + ":");
                        for (int categoriaIndex = 0; categoriaIndex < nomesCategorias.length; categoriaIndex++) {
                            double despesa = pessoa.get(categoriaIndex)[mesIndex];
                            System.out.printf("- %s: R$ %.2f\n", nomesCategorias[categoriaIndex], despesa);
                            totalMes += despesa;
                        }
                        System.out.println("Total de despesas no mês " + meses[mesIndex] + ": R$ " + totalMes);
                    }
                    break;

                case 5:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa registrada. Adicione uma pessoa primeiro.");
                    } else {
                        System.out.println("Escolha a categoria:");
                        for (int i = 0; i < nomesCategorias.length; i++) {
                            System.out.println((i + 1) + ". " + nomesCategorias[i]);
                        }
                        int categoriaIndex = scanner.nextInt() - 1;

                        double totalCategoria = 0;
                        for (List<double[]> pessoa : pessoas) {
                            double[] categoria = pessoa.get(categoriaIndex);
                            for (double despesa : categoria) {
                                totalCategoria += despesa;
                            }
                        }

                        System.out.println("Total de despesas na categoria " + nomesCategorias[categoriaIndex] +
                                           " para todas as pessoas: R$ " + totalCategoria);
                    }
                    break;

                case 6:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa registrada. Adicione uma pessoa primeiro.");
                    } else {
                        double totalGeral = 0;
                        for (List<double[]> pessoa : pessoas) {
                            for (double[] categoria : pessoa) {
                                for (double despesa : categoria) {
                                    totalGeral += despesa;
                                }
                            }
                        }
                        System.out.println("Total de todas as despesas de todas as pessoas em todos os meses: R$ " + totalGeral);
                    }
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);
    }
}
