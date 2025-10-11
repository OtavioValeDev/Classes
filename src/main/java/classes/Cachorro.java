package classes;

public class Cachorro extends Animal {
    //atributos
//    private String nome;
    private String raca, cor;
    private int idade;

    //construtor
//    public Cachorro(String nome, String raca, String cor, int idade) {
//        this.nome = nome;
//        this.raca = raca;
//        this.cor = cor;
//        this.idade = idade;
//    }

    // falta os metodos de acesso - getters e setters, eles servem para proteção, pois estamos utilizando atributos em private
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//    public String getNome() {
//        return nome;
//    }
//
//    public void setRaca(String raca) {
//        this.raca = raca;
//    }
//    public String getRaca() {
//        return raca;
//    }
//
//    public void setCor(String cor) {
//        this.cor = cor;
//    }
//    public String getCor() {
//        return cor;
//    }
//
//    public void setIdade(int idade) {
//        this.idade = idade;
//    }//não esqueça de mudar a tipagem
//    public int getIdade() {
//        return idade;
//    } //perceba a diferença na tipagem, o get muda pro set


    //metodos
    @Override//serve para reescrever o metodo da superclasse
    public void emitirSom(){
        super.emitirSom();
        System.out.println(super.getNome()+" está latindo");
    }
    @Override
    public void alimentar(){
        super.alimentar();
        System.out.println(super.getNome()+" está se alimentando");
    }



//    public void latir() {
//        System.out.println(nome + " latiu: au au");
//    }

//    public void mostrarDados() {
//        System.out.println("Nome:" + nome + ",\n" + "Raça:" + raca + ",\n" + "Cor:" + cor + ",\n" + "Idade:" + idade + "\n");
//        /*System.out.println("Raça:"+raca+",\n");
//        System.out.println("Cor:"+cor+",\n");
//        System.out.println("Idade:"+idade);*/
//    }
}
