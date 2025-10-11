package classes;

public class Animal {
    private String tipoAnimal;

    //construtor
    public Animal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    //getters e setter
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }


    //metodos
    public void Cachorro(){
        System.out.println("o Cachorro latiu: au au");
    }

    public void Peixe(){
        System.out.println("O peixe fez: glub glub");
    }
}
