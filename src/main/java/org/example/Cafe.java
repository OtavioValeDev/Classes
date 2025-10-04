package org.example;

import java.util.Scanner;
import java.lang.String;


public class Cafe {
    //instancia a classe Scanner para o input de dados
    Scanner scanner = new Scanner(System.in);
    //atributos
    String[] marcas = {"Pilão", "Melitta", "Três Corações", "Nescafé"};
    String mensagem, marca;
    char acucar;
    int quantidade, escolha;

    //escolha do café
    public void marcaCafe() {
        System.out.println("Qual será a marca do seu café?Escolha usando os numeros");
        for (int i = 0; i < marcas.length; i++) {
            System.out.println((i + 1) + "-" + marcas[i]);
        }
        escolha = scanner.nextInt();
//        String marca;
        if (escolha >= 1 && escolha <= marcas.length) {
            marca = marcas[escolha - 1];

            System.out.println("Você escolheu a marca: " + marca);
        } else {
            System.out.println("Opção invalida, escolha uma das marcas citadas");
            marca = "Opção invalida/ marca desconhecida";
        }
    }

    //pergunta se terá ou não açucar
    public void vaiAcucar() {
        System.out.println("Vai acuçar no seu café?s/n");
        acucar = scanner.next().charAt(0);

//        String mensagem;
        if (acucar == 's' || acucar == 'S') {
            mensagem = "Seu café vai vir com açucar";
            System.out.println(mensagem);
        } else {
            mensagem = "Seu café vai vir sem açucar";
            System.out.println(mensagem);
        }
    }

    //verifica a quantidade de café em ml
    public void quantidade() {
        System.out.println("Qual será a quantidade de café que vai querer?(Em ml)");
        quantidade = scanner.nextInt();
        System.out.println("Seu café possuirá " + quantidade + " ml");
    }

    //mostra os dados
    public void mostraDados() {
        System.out.println("Seu café da " + marca + " ,terá " + quantidade + " de ml e " + mensagem);
    }

    public void fechaScanner() {
        scanner.close();
    }
}
