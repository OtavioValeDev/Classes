package org.example;

import Classes.*;

public class Main {
    public static void main(String[] args) {
        Pessoa p= new Pessoa("Lucas");
        Cachorro c1= new Cachorro("Martinez","Dobberman",8);
        Cachorro c2= new Cachorro("Maria","Golden",2);

        p.adotarCachorro(c1);
        p.adotarCachorro(c2);

        p.listarCachorros();
    }
}
