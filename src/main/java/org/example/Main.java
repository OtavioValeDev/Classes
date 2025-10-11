package org.example;

import classes.Cafe;
import classes.Cachorro;
import classes.*; //traz tudo, diferente dos demais acima que só pego o necessário. siga os de cima, são uma boa pratica

//import Classes.Cachorro;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //chamando usando construtores
//        Cachorro cachorro = new Cachorro("Lucas", "Pintcher", "Marrom", 2);
//        cachorro.latir();
//        cachorro.mostrarDados();

        //chamando pelo atributo, só não esqueça de comentar o construtor
//        Cachorro c1 = new Cachorro();
//        c1.nome = "Pedro";
//        c1.raca = "Pastor Alemão";
//        c1.cor = "Preto";
//        c1.idade = 6;
//        c1.latir();
//        c1.mostrarDados();

        //chamando pelos metodos get/set e herança, só não esqueça de comentar o construtor
        Cachorro c2 = new Cachorro();
        c2.setNome("Luisa");
//        c2.setRaca("Shitzu");
//        c2.setCor("Branco");
        c2.setIdade(2);
//        System.out.println("Nome:" + c2.getNome() + ",\n" + "Raça:" + c2.getRaca() + ",\n" + "Cor:" + c2.getCor() + ",\n" + "Idade:" + c2.getIdade() + "\n");
        c2.emitirSom();
        c2.alimentar();
        c2.mostrarDados();

        //chamando a classe gato que herda de animal
        Gato gato = new Gato("Mingau", 3);
        gato.emitirSom();
        gato.alimentar();

        //via metodos, só não esqueça de comentar o construtor
//        Cafe cafe = new Cafe();
//        cafe.marcaCafe();
//        cafe.vaiAcucar();
//        cafe.quantidade();
//        cafe.mostraDados();

        //via get e set, só não esqueça de comentar o construtor
//        Cafe cafe2= new Cafe();
//        cafe2.newMarcaCafe(3);
//        cafe2.setAcucar('s');
//        cafe2.setQuantidade(600);
//        cafe2.mostraDados();

        //via construtor
//        Cafe melitta= new Cafe('s',500,2);
//        melitta.mostraDados();
    }
}