import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double angulo;

        System.out.print("Digite o ângulo em graus: ");
        angulo = ler.nextDouble();

        // Conversão de graus para radianos
        double radiano = angulo * (Math.PI / 180);
        System.out.println("Radiano: " + radiano);

        // Cálculos trigonométricos
        double seno = Math.sin(radiano);
        double cosseno = Math.cos(radiano);
        double tangente = Math.tan(radiano);

        // Cálculos com checagem para evitar divisão por zero
        double secante = (cosseno != 0) ? 1 / cosseno : Double.POSITIVE_INFINITY;
        double cossecante = (seno != 0) ? 1 / seno : Double.POSITIVE_INFINITY;
        double cotangente = (tangente != 0) ? 1 / tangente : Double.POSITIVE_INFINITY;

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Cotangente: " + cotangente);

        ler.close();
    }
}
