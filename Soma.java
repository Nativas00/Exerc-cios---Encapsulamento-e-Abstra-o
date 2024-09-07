package com.mycompany.areas;

public class Soma {

    public double soma(Number... numeros) {
        double soma = 0.0;
        for (Number num : numeros) {
            soma += num.doubleValue(); 
        }
        return soma;
    }

    public static void main(String[] args) {
        Soma calc = new Soma();

        // Testes com diferentes tipos de números
        System.out.println("Soma de inteiros: " + calc.soma(1, 2, 3));
        System.out.println("Soma de decimais: " + calc.soma(1.5, 2.3, 3.7));
        System.out.println("Soma mista: " + calc.soma(1, 2.5, 3, 4.8));
    }
}

