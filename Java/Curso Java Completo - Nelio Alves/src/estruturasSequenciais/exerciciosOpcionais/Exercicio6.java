package estruturasSequenciais.exerciciosOpcionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        sc.close();

        double pi = 3.14159;
        double areaTrianguloRetangulo = A * C / 2;
        double areaCirculo = pi * Math.pow(C, 2);
        double areaTrapezio = (A + B) / 2 * C;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        System.out.printf("""
                TRIANGULO = %.3f
                CIRCULO = %.3f
                TRAPEZIO = %.3f
                QUADRADO = %.3f
                RETANGULO = %.3f""", areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

    }
}