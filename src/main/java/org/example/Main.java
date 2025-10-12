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
//        Cachorro c2 = new Cachorro();
//        c2.setNome("Luisa");
//        c2.getNome();
//        c2.setRaca("Shitzu");
//        c2.getRaca();
//        c2.setCor("Branco");
//        c2.getCor();
//        c2.setIdade(2);
//        c2.getIdade();
//        System.out.println("Nome:" + c2.getNome() + ",\n" + "Raça:" + c2.getRaca() + ",\n" + "Cor:" + c2.getCor() + ",\n" + "Idade:" + c2.getIdade() + "\n");


//        Cafe cafe = new Cafe();
//        cafe.marcaCafe();
//        cafe.vaiAcucar();
//        cafe.quantidade();
//        cafe.mostraDados();

        Cafe cafe2= new Cafe();
//        cafe2.marcaCafe();
        cafe2.newMarcaCafe(3);
//        cafe2.vaiAcucar();
        cafe2.setAcucar('s');
//        cafe2.quantidade();
        cafe2.setQuantidade(600);
        cafe2.mostraDados();
}
}
