package com.mycompany.areas;

public class Areas {

    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public double calcularArea(int raio) {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        Areas calculator = new Areas();

        double ladoQuadrado = 5.0;
        double areaQuadrado = calculator.calcularArea(ladoQuadrado);
        System.out.println("Área do quadrado com lado " + ladoQuadrado + ": " + areaQuadrado);

        double larguraRetangulo = 4.0;
        double alturaRetangulo = 7.0;
        double areaRetangulo = calculator.calcularArea(larguraRetangulo, alturaRetangulo);
        System.out.println("Área do retângulo com largura " + larguraRetangulo + " e altura " + alturaRetangulo + ": " + areaRetangulo);

        int raioCirculo = 3;
        double areaCirculo = calculator.calcularArea(raioCirculo);
        System.out.println("Área do círculo com raio " + raioCirculo + ": " + areaCirculo);
    }
}