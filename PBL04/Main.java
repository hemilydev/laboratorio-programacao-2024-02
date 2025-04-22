import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome1, nome2;
        int matricula1, matricula2;
        double nota1_1, nota2_1, nota1_2, nota2_2;

        System.out.println("Digite o nome do aluno (a):");
        nome1 = ler.nextLine();

        System.out.println("Digite a matrícula:");
        matricula1 = ler.nextInt();

        System.out.println("Digite a nota de 1º grau:");
        nota1_1 = ler.nextDouble();

        System.out.println("Digite a nota de 2º grau:");
        nota2_1 = ler.nextDouble();

        ler.nextLine();

        System.out.println("Digite o nome do aluno (a):");
        nome2 = ler.nextLine();

        System.out.println("Digite a matrícula:");
        matricula2 = ler.nextInt();

        System.out.println("Digite a nota de 1º grau:");
        nota1_2 = ler.nextDouble();

        System.out.println("Digite a nota de 2º grau:");
        nota2_2 = ler.nextDouble();

        double media1 = (nota1_1 + nota2_1) / 2;
        double media2 = (nota1_2 + nota2_2) / 2;

        System.out.println("\n--- Resultado dos Alunos ---\n");

        System.out.println("Aluno: " + nome1 + " | Matrícula: " + matricula1 + " | Média: " + media1);
        System.out.println("Aluno: " + nome2 + " | Matrícula: " + matricula2 + " | Média: " + media2);

        ler.close();
    }
}
