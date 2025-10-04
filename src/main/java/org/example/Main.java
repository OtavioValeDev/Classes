package org.example;

//import org.example.Cachorro;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Cachorro cachorro = new Cachorro("Lucas", "Pintcher", "Marrom", 2);
        cachorro.latir();
        cachorro.mostrarDados();*/

//        Cachorro c1 = new Cachorro();
//        c1.nome = "Pedro";
//        c1.raca = "Pastor Alemão";
//        c1.cor = "Preto";
//        c1.idade = 6;
//        c1.latir();
//        c1.mostrarDados();

        Cafe cafe= new Cafe();
        cafe.marcaCafe();
        cafe.vaiAcucar();
        cafe.quantidade();
        cafe.mostraDados();
    }
}