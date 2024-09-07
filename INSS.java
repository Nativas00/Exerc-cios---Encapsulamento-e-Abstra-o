package com.mycompany.areas;

public class INSS {
    private double salarioBruto; 
    
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void calcularSalarioTotal() {
        double imposto;
        double salarioTotal;
        
        if (salarioBruto <= 1903.98) {
            salarioTotal = salarioBruto;
        } else if (salarioBruto <= 2826.65) {
            imposto = salarioBruto * 0.09 - 142.80;
            salarioTotal = salarioBruto - imposto;
        } else if (salarioBruto <= 3751.05) {
            imposto = salarioBruto * 0.15 - 354.80;
            salarioTotal = salarioBruto - imposto;
        } else if (salarioBruto <= 4664.68) {
            imposto = salarioBruto * 0.225 - 636.13;
            salarioTotal = salarioBruto - imposto;
        } else {
            imposto = salarioBruto * 0.275 - 869.36;
            salarioTotal = salarioBruto - imposto;
        }
        
        System.out.println("Seu salario total é: " + salarioTotal);
    }

    public static void main(String[] args) {
        INSS inss = new INSS();
        inss.setSalarioBruto(3000.00); 
        inss.calcularSalarioTotal();
    }
}
