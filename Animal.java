package com.mycompany.areas;

public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();

    public abstract void mover();

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}

class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au Au!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está correndo.");
    }
}

class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está andando silenciosamente.");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5);
        Gato gato = new Gato("Luna", 3);

        cachorro.exibirInfo();
        cachorro.emitirSom();
        cachorro.mover();

        gato.exibirInfo();
        gato.emitirSom();
        gato.mover();
    }
}

