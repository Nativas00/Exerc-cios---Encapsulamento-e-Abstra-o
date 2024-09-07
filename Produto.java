package com.mycompany.areas;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;

    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Nome do produto: " + nome);
    }

    public void exibirInfo(boolean exibirCodigo) {
        System.out.println("Nome do produto: " + nome);
        if (exibirCodigo) {
            System.out.println("Código do produto: " + codigo);
        }
    }

    public void exibirInfo(boolean exibirCodigo, boolean exibirPreco) {
        System.out.println("Nome do produto: " + nome);
        if (exibirCodigo) {
            System.out.println("Código do produto: " + codigo);
        }
        if (exibirPreco) {
            System.out.println("Preço do produto: R$ " + preco);
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Smartphone", 12345, 1500.00);

        produto.exibirInfo();
        produto.exibirInfo(true);
        produto.exibirInfo(true, true);
    }
}
