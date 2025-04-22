import java.util.Scanner;

public class PBL10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sequência de Fibonacci: ");
        int qtd = scanner.nextInt();

        System.out.print("Utilizando for: ");
        int n1 = 0, n2 = 1;
        for (int i = 0; i < qtd; i++) {
            System.out.print(n1);
            if (i < qtd - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
      
        System.out.println(" Fim");

        n1 = 0;
        n2 = 1;
      
        System.out.print("Utilizando do-while: ");
      
        int i = 0;
      
        do {
            System.out.print(n1);
            if (i < qtd - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            i++;
        } while (i < qtd);
      
        System.out.println(" Fim");

        n1 = 0;
        n2 = 1;
        i = 0;
      
        System.out.print("Utilizando while: ");
      
        while (i < qtd) {
            System.out.print(n1);
            if (i < qtd - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            i++;
        }
      
        System.out.println(" Fim");

        scanner.close();
    }
}
