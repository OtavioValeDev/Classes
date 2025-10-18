package Classes;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    String nome;
    List<Cachorro> cachorros= new ArrayList<>();

   public Pessoa(String nome){
        this.nome=nome;
    }

   public void adotarCachorro(Cachorro c){
        this.cachorros.add(c);
        System.out.println(this.nome+" adotou "+c.getNome());
    }

    public void listarCachorros(){
        System.out.println("\n"+this.nome+" tem esses cachorros:");
        for(Cachorro c:cachorros){
            c.mostrarDados();
        }
    }
}
