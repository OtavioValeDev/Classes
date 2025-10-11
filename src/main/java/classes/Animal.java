package classes;

//deve ser o mais genérico possivel
// não use public ou private nos metodos sem usar o super, só assim os filhos conseguem acessar.
// como um construtor e a tipagem do metodo deve refletir tambem na subclasse
public class Animal {
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }



    public void emitirSom() {
        System.out.println("Som do animal");
    }

    public void alimentar() {
        System.out.println("O animal está se alimentando");
    }

    public void mostrarDados() {
        System.out.println("Nome do animal:" + nome + ",\n" + "Idade do animal:" + idade + "\n");
    }
}
