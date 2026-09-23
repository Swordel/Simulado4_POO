package com.simulado4;

//Enunciado: Crie uma classe Tool que possua um metodo, estático, chamado flip que receba uma Dupla < S, T > e retorne uma nova Dupla < T, S >.
public class Tool {
    public static <S, T> Dupla<T, S> flip(Dupla<S, T> dupla) {
        return new Dupla<>(dupla.second(), dupla.first());
    }

    /* Explicação:
    O <S, T> logo após o static é a declaração dos tipos genéricos do método. Você está dizendo ao compilador:
        "Este método usa dois tipos genéricos chamados S e T, guarde isso."
        Sem ele, o compilador veria S e T no método e não saberia o que são. Tire isso e veja falhar!
        O Dupla<T, S> depois é o tipo de retorno — ou seja, o método devolve uma Dupla com os tipos invertidos.
    */
}
