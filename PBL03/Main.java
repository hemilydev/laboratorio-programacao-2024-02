public class Main {

    public static void main(String[] args) {

        int a = 24;
        int b = 6;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;

        int potenciaQuadradoA = a * a;
        int potenciaQuadradoB = b * b;

        int potenciaCuboA = a * a * a;
        int potenciaCuboB = b * b * b;

        double mediaSimples = (a + b) / 2.0;
        double diferencaPercentual = ((double)(a - b) / b) * 100;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Potência ao quadrado de a: " + potenciaQuadradoA);
        System.out.println("Potência ao quadrado de b: " + potenciaQuadradoB);
        System.out.println("Potência ao cubo de a: " + potenciaCuboA);
        System.out.println("Potência ao cubo de b: " + potenciaCuboB);
        System.out.println("Média simples: " + mediaSimples);
        System.out.println("Diferença percentual de a em relação a b: " + diferencaPercentual + "%");

    }
}
