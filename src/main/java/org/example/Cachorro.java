package org.example;

public class Cachorro {
    //atributos
    String nome, raca, cor;
    int idade;

    //construtor
    /*public Cachorro(String nome, String raca, String cor, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
    }*/

    //    falta os metodos de acesso - getters e setters
    //metodos
    public void latir() {
        System.out.println(nome + " latiu: au au");
    }

    public void mostrarDados() {
        System.out.println("Nome:" + nome + ",\n" + "Raça:" + raca + ",\n" + "Cor:" + cor + ",\n" + "Idade:" + idade + "\n");
        /*System.out.println("Raça:"+raca+",\n");
        System.out.println("Cor:"+cor+",\n");
        System.out.println("Idade:"+idade);*/
    }
}
