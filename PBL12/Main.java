import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        long fatorialParaSoma = fatorial;
        int soma = 0;
        while (fatorialParaSoma > 0) {
            soma += fatorialParaSoma % 10;
            fatorialParaSoma /= 10;
        }
        System.out.println("A soma dos dígitos é: " + soma);

        long fatorialParaContagem = fatorial;
        int contadorImpares = 0;
        do {
            int digito = (int) (fatorialParaContagem % 10);
            if (digito % 2 != 0) {
                contadorImpares++;
            }
            fatorialParaContagem /= 10;
        } while (fatorialParaContagem > 0);

        System.out.println("A quantidade de dígitos ímpares é: " + contadorImpares);
    }
}
