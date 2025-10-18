package Classes;

public class Cachorro{
    String nome,raca;
    int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void mostrarDados(){
        System.out.println(this.nome+"|"+this.raca+"|"+this.idade);
    }
}
