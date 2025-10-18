package Classes;

public abstract class Animal {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

//    Método abstrato — subclasses são obrigadas a implementar
    public abstract void emitirSom();
}
