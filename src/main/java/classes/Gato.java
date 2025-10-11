package classes;

public class Gato {
    private String nome;
    private int idade;

    //diferente do cachorro, o gato não tem construtor vazio
    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Miau");
    }
    public void alimentar() {
        System.out.println(nome + " está comendo ração de gato.");
    }
    
}
