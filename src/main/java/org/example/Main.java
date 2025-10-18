package org.example;

import Classes.Animal;
import Classes.Cachorro;
import Classes.Gato;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro();
        animais[0].setNome("Pedro");
        animais[0].emitirSom(); // Pedro está latindo

        animais[0] = new Gato();
        animais[0].setNome("Smile");
        animais[0].emitirSom();
    }
}
