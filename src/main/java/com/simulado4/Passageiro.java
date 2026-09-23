
package com.simulado4;

public class Passageiro {

    private String name;
    private boolean estudante;

    public Passageiro(String name, boolean estudante){
        this.name = name;
        this.estudante = estudante;
    }

    public boolean isEstudante(){
        return estudante;
    }

    public String getName() {
        return name;
    }

    public void listar(){
        System.out.println("Nome: " + name);

        if(estudante)
            System.out.println("Estudante");
        else
            System.out.println("Nao eh estudante");

        //Outra forma:
        //System.out.println(estudante ? "Estudante." : "Nope estudante.");

    }

}
