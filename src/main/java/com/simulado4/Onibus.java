package com.simulado4;

import java.util.ArrayList;

//ONIBUS HAS-MANY PASSAGEIROS
public class Onibus {

    private ArrayList<Passageiro> onibus;
    private double preco;

    public Onibus(double preco){
        onibus = new ArrayList<>();
        this.preco = preco;
    }

    public void inserirPassageiro(Passageiro p) {
        if (p == null) {
            System.out.println("Passageiro invalido");
            return;
        }

        onibus.add(p);
    }

    
    public void mostrarTodos(){
        for(Passageiro p : onibus){
            p.listar();
        }
    }

    public void mostrarEstudantes(){
        for(Passageiro p : onibus){
            if(p.isEstudante())
                System.out.println(p.getName());
        }
    }

    public double calcularPreco(){
        double total = 0;
        for(Passageiro p : onibus){
            if(p.isEstudante())
                total += preco/2;

            else
                total += preco;
        }
        
        return total;
    }

}
