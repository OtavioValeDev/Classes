package Classes;

public class Cachorro extends Animal {
    private String raca, cor;
    private int idade;

    @Override
    public void emitirSom(){
        System.out.println(getNome() + " está latindo");
    }
}
