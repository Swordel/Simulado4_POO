package com.simulado4;

public class Dupla<S,T> {
    private S primeiro;
    private T segundo;

    public Dupla(S primeiro, T segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public S first() {
        return primeiro;
    }

    public T second() {
        return segundo;
    }

}
