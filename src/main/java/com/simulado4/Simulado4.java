package com.simulado4;

public class Simulado4 {

    public static void main(String[] args) {
        
        //===================== EXERCÍCIO 1

        /*

        (a) Esboce um diagrama de classes

        --------------------------------                     -------------------------------  
       |      PASSAGEIRO                |                   |        ONIBUS                 | 
       |------------------------------  |                   |------------------------------ | 
       |- String name                   |                   |- ArrayList<Passageiro> onibus | 
       |- boolean estudante             |       1..*        |- double preco                 |    
       |------------------------------  | <----------------◊|------------------------------ |
       |+ boolean isEstudante()         |       has-many    |+ void inserirPassageiro(p)    |
       |+ String getName()              |                   |+ void mostrarTodos()          |
       |+ void listar()                 |                   |+ void mostrarEstudantes()     |
       ----------------------------------                   |+ double calcularPreco()       |
        .                                                   |-------------------------------|
                                                            

                    --- CONVENÇÕES UTILIZADAS ----
        -> Visibilidade: - significa private, + significa public.

        -> Losango + seta: representa a relação HAS-MANY. O losango fica no lado do "dono" (Bus) e a seta aponta para o "possuído" (Passageiro). O 1..* indica "um ONIBUS possui vários Passageiros".

        -> Três seções: header (nome da classe), atributos e métodos

        */

       //(b) Implemente as classes e escreva um pequeno teste.

        /*

        Passageiro p1 = new Passageiro("Gaby",true);
        Passageiro p2 = new Passageiro("Bela",false);
        Passageiro p3 = new Passageiro("Xuxu",true);
        Onibus b = new Onibus(10); //passagem 10 reais

        b.inserirPassageiro(p1);
        b.inserirPassageiro(p2);
        b.inserirPassageiro(p3);
        b.mostrarTodos(); // Gaby e Xuxu são estudantes
        System.out.println("Total: R$" + b.calcularPreco()); //20
        System.out.println("---Apenas estudantes a seguir ---"); 
        b.mostrarEstudantes();

        */

        //===================== EXERCÍCIO 2

        /*
        Dupla<String, Integer> dupla = new Dupla<>("Ola", 42);

        System.out.println(dupla.first());   // Olá
        System.out.println(dupla.second());  // 42

        Dupla<Integer, String> invertida = Tool.flip(dupla);

        System.out.println(invertida.first());   // 42
        System.out.println(invertida.second());  // Olá
        
        */

        //===================== EXERCÍCIO 3

         /*

        Produto p1 = new Produto("CANETA", 2.30, Tipo.ESCRITORIO);
        p1.mostrar();       // saída: { produtoNome:"CANETA", preco:2.3, tipo:"ESCRITORIO" }

        */

        //===================== EXERCÍCIO 4

        /* 
        (a) O modificador static é um meio de se obter Generics (Polimorfismo Parametrico);
        FALSA — static não tem relação com Generics. Generics é obtido com <T> na declaração da classe ou método, como em class Dupla<T>.


        (b) O modificador protected indica que apenas as subclasses terao acesso a um determinado membro;
        FALSA — protected dá acesso ao mesmo pacote e subclasses. Não é exclusivo de subclasses.


        (c) O modificador default (no modifier) indica que apenas classes do mesmo pacote possuirao acesso a um membro.
        VERDADEIRA


        (d) Usar atributos publicos aumenta o acoplamento entre classes;
        VERDADEIRA -> atributos públicos permitem que qualquer classe leia e modifique diretamente, criando dependência direta entre classes e aumentando o acoplamento.
        Lembre-se -> acoplamento: o quanto uma classe A sabe/modifica o estado de outra classe B
                    Coesão: o quanto a classe A sabe/modifica o próprio estado
                        Geralmente, procura-se acoplamento baixo e coesão alta!


        (e) É impossível criar um método para converter Stack¡String para Stack¡Integer;
        FALSA — é totalmente possível. Basta iterar a Stack<String>, converter cada elemento com Integer.parseInt() e empilhar numa nova Stack<Integer>.


        (f) Um método marcado como void pode possuir retorno valorado;
        FALSA — void significa ausência de retorno. Um método void não pode usar return valor — apenas return vazio para interromper a execução.


        (g) B ”HAS A” B indica que B, de alguma forma, pode se tornar uma estrutura semelhante a uma lista;
        VERDADEIRA — HAS-A significa que uma classe possui outra como atributo. Se esse atributo for um array ou ArrayList do tipo B, forma uma estrutura de lista.


        (h) Um método setter é uma maneira de dar acesso de escrita APENAS a um atributo private;
        FALSA — um setter dá acesso de escrita a um atributo private, mas não apenas isso.

           I) O "APENAS" está errado — um setter pode fazer mais do que só atribuir, pode conter lógica de validação dentro. Exemplo:
            public void setSaldo(double valor){
                if(valor >= 0)        // validação extra
                    this.saldo = valor;
            }

           II) Não precisa ser private — um setter pode modificar um atributo de qualquer visibilidade: public, default, protected.
           O propósito principal de um setter é dar acesso de escrita a um atributo, mas a afirmação erra ao dizer "APENAS" e ao restringir a private.

        (i) Uma classe pode possuir atributos e objetos sem necessidade de se ter uma instancia;
        VERDADEIRA — atributos e métodos static pertencem à classe em si, não a instâncias. Math.sqrt() é um exemplo clássico — você usa sem criar um objeto Math.

        (j) Uma Enum é um tipo que permite uma variável a ter um conjunto finito de valores
        VERDADEIRA — enum restringe os valores possíveis de uma variável a um conjunto predefinido, como Tipo.ESCRITORIO, etc.
        
        */
    }
}
