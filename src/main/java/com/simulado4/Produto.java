package com.simulado4;

public class Produto {

    private String nome;
    private double preco;
    private Tipo tipo;

    public Produto(String nome, double preco, Tipo tipo){
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public void mostrar(){
        System.out.println("{ produtoNome:\"" + nome + "\", preco:" + preco + ", tipo:\"" + tipo + "\" }");
    }

}
