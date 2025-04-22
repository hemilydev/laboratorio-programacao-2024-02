import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeRegiao = "";
        String nomePais = "";
        String detalhesVoo = "";

        System.out.println("Bem-vindo ao Sistema de Reserva de Passagens Aéreas!");
        System.out.println("Escolha a região de destino:");
        System.out.println("1. América");
        System.out.println("2. Europa");
        System.out.println("3. Ásia");

        int opcaoRegiao = scanner.nextInt();

        switch (opcaoRegiao) {
            case 1:
                nomeRegiao = "América";
                break;
            case 2:
                nomeRegiao = "Europa";
                break;
            case 3:
                nomeRegiao = "Ásia";
                break;
            default:
                System.out.println("Opção de região inválida.");
                scanner.close();
                return;
        }

        System.out.println();
        System.out.println("Você escolheu a região: " + nomeRegiao);
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Escolha o país de destino:");

        int opcaoPais = 0;

        switch (opcaoRegiao) {
            case 1:
                System.out.println("1. Brasil");
                System.out.println("2. Estados Unidos");
                System.out.println("3. Canadá");
                break;
            case 2:
                System.out.println("1. França");
                System.out.println("2. Alemanha");
                System.out.println("3. Itália");
                break;
            case 3:
                System.out.println("1. Japão");
                System.out.println("2. China");
                System.out.println("3. Índia");
                break;
        }

        opcaoPais = scanner.nextInt();

        switch (opcaoRegiao) {
            case 1:
                switch (opcaoPais) {
                    case 1:
                        nomePais = "Brasil";
                        break;
                    case 2:
                        nomePais = "Estados Unidos";
                        break;
                    case 3:
                        nomePais = "Canadá";
                        break;
                    default:
                        System.out.println("Opção de país inválida.");
                        scanner.close();
                        return;
                }
                break;
            case 2:
                switch (opcaoPais) {
                    case 1:
                        nomePais = "França";
                        break;
                    case 2:
                        nomePais = "Alemanha";
                        break;
                    case 3:
                        nomePais = "Itália";
                        break;
                    default:
                        System.out.println("Opção de país inválida.");
                        scanner.close();
                        return;
                }
                break;
            case 3:
                switch (opcaoPais) {
                    case 1:
                        nomePais = "Japão";
                        break;
                    case 2:
                        nomePais = "China";
                        break;
                    case 3:
                        nomePais = "Índia";
                        break;
                    default:
                        System.out.println("Opção de país inválida.");
                        scanner.close();
                        return;
                }
                break;
        }

        System.out.println();
        System.out.println("Você escolheu o país: " + nomePais);
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Escolha o voo:");

        int opcaoVoo = 0;

        switch (opcaoRegiao) {
            case 1:
                switch (opcaoPais) {
                    case 1:
                        System.out.println("1. Voo 101 - São Paulo -> Rio de Janeiro");
                        System.out.println("2. Voo 102 - São Paulo -> Brasília");
                        System.out.println("3. Voo 103 - São Paulo -> Salvador");
                        break;
                    case 2:
                        System.out.println("1. Voo 201 - New York -> Los Angeles");
                        System.out.println("2. Voo 202 - New York -> Miami");
                        System.out.println("3. Voo 203 - Chicago -> Houston");
                        break;
                    case 3:
                        System.out.println("1. Voo 301 - Toronto -> Vancouver");
                        System.out.println("2. Voo 302 - Toronto -> Montreal");
                        System.out.println("3. Voo 303 - Vancouver -> Ottawa");
                        break;
                }
                break;
            case 2:
                switch (opcaoPais) {
                    case 1:
                        System.out.println("1. Voo 401 - Paris -> Lyon");
                        System.out.println("2. Voo 402 - Paris -> Nice");
                        System.out.println("3. Voo 403 - Lyon -> Marseille");
                        break;
                    case 2:
                        System.out.println("1. Voo 501 - Berlim -> Munique");
                        System.out.println("2. Voo 502 - Berlim -> Hamburgo");
                        System.out.println("3. Voo 503 - Munique -> Frankfurt");
                        break;
                    case 3:
                        System.out.println("1. Voo 601 - Roma -> Milão");
                        System.out.println("2. Voo 602 - Roma -> Veneza");
                        System.out.println("3. Voo 603 - Milão -> Florença");
                        break;
                }
                break;
            case 3:
                switch (opcaoPais) {
                    case 1:
                        System.out.println("1. Voo 701 - Tóquio -> Osaka");
                        System.out.println("2. Voo 702 - Tóquio -> Kyoto");
                        System.out.println("3. Voo 703 - Osaka -> Nagoya");
                        break;
                    case 2:
                        System.out.println("1. Voo 801 - Pequim -> Xangai");
                        System.out.println("2. Voo 802 - Pequim -> Shenzhen");
                        System.out.println("3. Voo 803 - Xangai -> Guangzhou");
                        break;
                    case 3:
                        System.out.println("1. Voo 901 - Delhi -> Mumbai");
                        System.out.println("2. Voo 902 - Delhi -> Bangalore");
                        System.out.println("3. Voo 903 - Mumbai -> Chennai");
                        break;
                }
                break;
        }

        opcaoVoo = scanner.nextInt();

        switch (opcaoRegiao) {
            case 1:
                switch (opcaoPais) {
                    case 1:
                        switch (opcaoVoo) {
                            case 1:
                                detalhesVoo = "Voo 101 - São Paulo -> Rio de Janeiro";
                                break;
                            case 2:
                                detalhesVoo = "Voo 102 - São Paulo -> Brasília";
                                break;
                            case 3:
                                detalhesVoo = "Voo 103 - São Paulo -> Salvador";
                                break;
                            default:
                                System.out.println("Opção de voo inválida.");
                                scanner.close();
                                return;
                        }
                        break;
                    case 2:
                        switch (opcaoVoo) {
                            case 1:
                                detalhesVoo = "Voo 201 - New York -> Los Angeles";
                                break;
                            case 2:
                                detalhesVoo = "Voo 202 - New York -> Miami";
                                break;
                            case 3:
                                detalhesVoo = "Voo 203 - Chicago -> Houston";
                                break;
                            default:
                                System.out.println("Opção de voo inválida.");
                                scanner.close();
                                return;
                        }
                        break;
                    case 3:
                        switch (opcaoVoo) {
                            case 1:
                                detalhesVoo = "Voo 301 - Toronto -> Vancouver";
                                break;
                            case 2:
                                detalhesVoo = "Voo 302 - Toronto -> Montreal";
                                break;
                            case 3:
                                detalhesVoo = "Voo 303 - Vancouver -> Ottawa";
                                break;
                            default:
                                System.out.println("Opção de voo inválida.");
                                scanner.close();
                                return;
                        }
                        break;
                }
                break;
            case 2:
                switch (opcaoPais) {
                    case 1:
                        switch (opcaoVoo) {
                            case 1:
                                detalhesVoo = "Voo 401 - Paris -> Lyon";
                                break;
                            case 2:
                                detalhesVoo = "Voo 402 - Paris -> Nice";
                                break;
                            case 3:
                                detalhesVoo = "Voo 403 - Lyon -> Marseille";
                                break;
                            default:
                                System.out.println("Opção de voo inválida.");
                                scanner.close();
                                return;
                        }
                        break;
                    case 2:
                        switch (opcaoVoo) {
                            case 1:
                                detalhesVoo = "Voo 501 - Berlim -> Munique";
                                break;
                            case 2:
                                detalhesVoo = "Voo 502 - Berlim -> Hamburgo";
                                break;
                            case 3:
                                detalhesVoo = "Voo 503 - Munique -> Frankfurt";
                                break;
                            default:
                                System.out.println("Opção de voo inválida.");
                                scanner.close();
                                return;
                        }
                        break;
                    case 3:
                        switch (opcaoVoo) {
                            case 1:
                                detalhesVoo = "Voo 601 - Roma -> Milão";
                                break;
                            case 2:
                                detalhesVoo = "Voo 602 - Roma -> Veneza";
                                break;
                            case 3:
                                detalhesVoo = "Voo 603 - Milão -> Florença";
                                break;
                            default:
                                System.out.println("Opção de voo inválida.");
                                scanner.close();
                                return;
                        }
                        break;
                }
                break;
            case 3:
                switch (opcaoPais) {
                    case 1:
                        switch (opcaoVoo) {
                            case 1:
                                detalhesVoo = "Voo 701 - Tóquio -> Osaka";
                                break;
                            case 2:
                                detalhesVoo = "Voo 702 - Tóquio -> Kyoto";
                                break;
                            case 3:
                                detalhesVoo = "Voo 703 - Osaka -> Nagoya";
                                break;
                            default:
                                System.out.println("Opção de voo inválida.");
                                scanner.close();
                                return;
                        }
                        break;
                    case 2:
                        switch (opcaoVoo) {
                            case 1:
                                detalhesVoo = "Voo 801 - Pequim -> Xangai";
                                break;
                            case 2:
                                detalhesVoo = "Voo 802 - Pequim -> Shenzhen";
                                break;
                            case 3:
                                detalhesVoo = "Voo 803 - Xangai -> Guangzhou";
                                break;
                            default:
                                System.out.println("Opção de voo inválida.");
                                scanner.close();
                                return;
                        }
                        break;
                    case 3:
                        switch (opcaoVoo) {
                            case 1:
                                detalhesVoo = "Voo 901 - Delhi -> Mumbai";
                                break;
                            case 2:
                                detalhesVoo = "Voo 902 - Delhi -> Bangalore";
                                break;
                            case 3:
                                detalhesVoo = "Voo 903 - Mumbai -> Chennai";
                                break;
                            default:
                                System.out.println("Opção de voo inválida.");
                                scanner.close();
                                return;
                        }
                        break;
                }
                break;
        }

        System.out.println();
        System.out.println("Detalhes do voo:");
        System.out.println(detalhesVoo);

        scanner.close();
    }
}
