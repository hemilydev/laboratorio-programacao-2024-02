import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada do diâmetro da esfera
        System.out.print("Digite o diâmetro da esfera: ");
        double diamEsfera = ler.nextDouble();
        double raio = diamEsfera / 2;

        // Cálculo do perímetro (circunferência)
        double perimetro = Math.PI * diamEsfera;

        // Cálculo da área de superfície da esfera
        double areaSuperficie = 4 * Math.PI * Math.pow(raio, 2);

        // Cálculo do volume da esfera
        double volumeEsfera = (4 * Math.PI * Math.pow(raio, 3)) / 3;

        // Entrada do ângulo do arco
        System.out.print("Digite o ângulo do arco em graus: ");
        double arcoAngulo = ler.nextDouble();

        // Comprimento do arco
        double comprimentoArco = (arcoAngulo / 360) * (2 * Math.PI * raio);

        // Área do setor circular
        double areaSetorCircular = (arcoAngulo / 360) * Math.PI * Math.pow(raio, 2);

        // Área do triângulo inscrito (equilátero com lado igual ao raio)
        double areaInscrito = 0.5 * Math.pow(raio, 2);

        // Área do triângulo circunscrito (equilátero com lado igual ao diâmetro)
        double lado = diamEsfera;
        double semiperimetro = (3 * lado) / 2;
        double areaCircunscrito = Math.sqrt(semiperimetro * Math.pow(semiperimetro - lado, 3));

        // Saídas
        System.out.println();
        System.out.println("Raio: " + raio);
        System.out.println("Perímetro (Circunferência): " + perimetro);
        System.out.println("Área da superfície: " + areaSuperficie);
        System.out.println("Volume da esfera: " + volumeEsfera);
        System.out.println("Comprimento do arco: " + comprimentoArco);
        System.out.println("Área do setor circular: " + areaSetorCircular);
        System.out.println("Área do triângulo inscrito: " + areaInscrito);
        System.out.println("Área do triângulo circunscrito: " + areaCircunscrito);

        ler.close();
    }
}
