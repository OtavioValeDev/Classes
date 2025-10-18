package Classes;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println(getNome()+" está miando");
    }


}