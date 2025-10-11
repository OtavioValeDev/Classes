package classes;

import java.util.Scanner;
import java.lang.String;


public class Cafe {
    //instancia a classe Scanner para o input de dados
    Scanner scanner = new Scanner(System.in);
    //atributos
    private String[] marcas = {"Pilão", "Melitta", "Três Corações", "Nescafé"};
    private String mensagem, marca;
    private char acucar;
    private int quantidade, escolha, numero;

    //construtor
    public Cafe(char acucar, int quantidade, int numero) {
        this.acucar = acucar;
        this.quantidade = quantidade;
        this.numero = numero;

        //novamente, uma cópia do newcafe e escolha cafe
        //funciona somente usando os construtores
        if (numero >= 1 && numero <= marcas.length) {
            this.marca = marcas[numero - 1];
        } else {
            this.marca = "Escolha uma marca existente";
        }

        //mesmo role do cafe
        if (acucar == 's' || acucar == 'S') {
            mensagem = "Seu café vai vir com açucar";
            System.out.println(mensagem);
        } else {
            mensagem = "Seu café vai vir sem açucar";
            System.out.println(mensagem);
        }
    }

    //metodos getter e setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setAcucar(char acucar) {
        this.acucar = acucar;

        if (acucar == 's' || acucar == 'S') {
            this.mensagem = "Seu café vai vir com açucar";
        } else {
            this.mensagem = "Seu café vai vir sem açucar";
        }
    }

    public char getAcucar() {
        return acucar;
    }

    //metodos
    //funciona usando get e set
    public void newMarcaCafe(int numero) {
        if (numero >= 1 && numero <= marcas.length) {
            this.marca = marcas[numero - 1];
        } else {
            this.marca = "Marca inválida";
        }
    }

    //funciona chamando diretamente o metodo
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
