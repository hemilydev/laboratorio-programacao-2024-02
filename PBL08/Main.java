import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você sequer conhece este cara?");
        System.out.println("1. Sim\n2. Não");
        int conhece = scanner.nextInt();

        if (conhece == 1) {
            System.out.println("Você gosta dele?");
            System.out.println("1. Sim\n2. Não");
            int gosta = scanner.nextInt();

            if (gosta == 1) {
                System.out.println("Como vocês se conhecem?");
                System.out.println("1. Somos parentes\n2. Melhores amigos\n3. Ex-colegas\n4. A gente ficava");
                int comoConhece = scanner.nextInt();

                if (comoConhece == 1) {
                    System.out.println("Próximos?");
                    System.out.println("1. Sim\n2. Não");
                    int proximos = scanner.nextInt();

                    if (proximos == 1) {
                        System.out.println("Fique feliz junto.");
                    } else {
                        System.out.println("Você é muito mais velho(a) ou jovem?");
                        System.out.println("1. Velha(o)\n2. Mais jovem");
                        int idade = scanner.nextInt();

                        if (idade == 1) {
                            System.out.println("Tente comentar, mas falhe e acabe atualizando o próprio status.");
                        } else {
                            System.out.println("Você vai acabar postando um comentário metido a engraçadinho, né?");
                            System.out.println("1. Sim");
                            int engraçado = scanner.nextInt();
                            if (engraçado == 1) {
                                System.out.println("Seja um babaca idiota, mesmo sem ter anonimato.");
                            }
                        }
                    }
                } else if (comoConhece == 2) {
                    System.out.println("Melhores amigos MESMO ou você só está sendo bizarro de novo?");
                    System.out.println("1. Mesmo\n2. Bem...");
                    int melhorAmigo = scanner.nextInt();

                    if (melhorAmigo == 1) {
                        System.out.println("Fique feliz junto.");
                    } else {
                        System.out.println("Esquece, não vai rolar.");
                    }
                } else if (comoConhece == 3) {
                    System.out.println("Vocês mantém contato?");
                    System.out.println("1. Pouco\n2. Sim! Ainda somos bons amigos");
                    int contato = scanner.nextInt();

                    if (contato == 1) {
                        System.out.println("Lutando uma guerra perdida.");
                    } else {
                        System.out.println("Droga, parece que você vai ter que comprar presente.");
                    }
                } else if (comoConhece == 4) {
                    System.out.println("Terminou bem?");
                    System.out.println("1. Sim! Ainda somos bons amigos\n2. Não, eu tomei um pé");
                    int terminouBem = scanner.nextInt();

                    if (terminouBem == 1) {
                        System.out.println("Droga, parece que você vai ter que comprar presente.");
                    } else {
                        System.out.println("Esquece, não vai rolar.");
                    }
                }
            } else {
                System.out.println("Por que?");
                System.out.println("1. A gente ficava\n2. Ignorou todas as minhas cartas de amor e fotos nuas");
                int porque = scanner.nextInt();

                if (porque == 1) {
                    System.out.println("Terminou bem?");
                    System.out.println("1. Sim! Ainda somos bons amigos\n2. Não, eu tomei um pé");
                    int terminouBem = scanner.nextInt();

                    if (terminouBem == 1) {
                        System.out.println("Droga, parece que você vai ter que comprar presente.");
                    } else {
                        System.out.println("Esquece, não vai rolar.");
                    }
                } else {
                    System.out.println("Ok, isso foi muito bizarro.");
                    System.out.println("1. Mas somos PERFEITOS um para o outro!\n2. Tá certo.");
                    int respostaPerfeitos = scanner.nextInt();

                    if (respostaPerfeitos == 1) {
                        System.out.println("Esquece, não vai rolar.");
                    } else if (respostaPerfeitos == 2) {
                        System.out.println("Não comente, apenas continue sendo bizarro(a).");
                    }
                }
            }
        } else {
            System.out.println("Gostaria de conhecer?");
            System.out.println("1. Faria tudo por isso!\n2. Não");
            int conhecer = scanner.nextInt();

            if (conhecer == 1) {
                System.out.println("Ok, isso foi muito bizarro.");
                System.out.println("1. Mas somos PERFEITOS um para o outro!\n2. Tá certo.");
                int respostaPerfeitos = scanner.nextInt();

                if (respostaPerfeitos == 1) {
                    System.out.println("Esquece, não vai rolar.");
                } else if (respostaPerfeitos == 2) {
                    System.out.println("Não comente, apenas continue sendo bizarro(a).");
                }
            } else {
                System.out.println("Então por que vocês são amigos no Facebook?");
                System.out.println("1. Só para zoar");
                int zoar = scanner.nextInt();

                if (zoar == 1) {
                    System.out.println("Você vai acabar postando um comentário metido a engraçadinho, né?");
                    System.out.println("1. Sim");
                    int engraçado = scanner.nextInt();

                    if (engraçado == 1) {
                        System.out.println("Seja um babaca idiota, mesmo sem ter anonimato.");
                    }
                }
            }
        }

        scanner.close();
    }
}
