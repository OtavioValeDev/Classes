package Classes;

public class Gato extends Animal {
    private String nome;
    private int idade;


    @Override
    public void emitirSom() {
        System.out.println(getNome()+" está miando");
    }


}