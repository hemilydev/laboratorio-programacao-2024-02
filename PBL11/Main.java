import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos nomes você deseja declarar? ");
        int count = ler.nextInt();
        ler.nextLine();

        String[] nomes = new String[count];
        int[] idades = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Qual o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = ler.nextLine();
            System.out.print("Qual a idade da pessoa " + (i + 1) + ": ");
            idades[i] = ler.nextInt();
            ler.nextLine();
        }

        System.out.println("\nNomes e idades declarados:");
        for (int i = 0; i < count; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i] + ", Idade: " + idades[i]);
        }

        ler.close();
    }
}
