import java.util.*;
import java.util.function.*;

class ExLambda {

    public static void main(String[] args){
        List<Pessoa> p = new ArrayList();
        p.add(new Pessoa("Ana",17));
        p.add(new Pessoa("Paulo",21));
        p.add(new Pessoa("Renata",60));
        p.add(new Pessoa("Carlos",15));

        FiltradorDePessoas pesquisa = new FiltradorDePessoas();

        //Lambda
        //Functional Interface (1 método)
        //(Tipo p) -> { código };
        //(Tipo p1, Tipo p2) -> { código };
        // p -> código;
        //(p1, p2) -> { código };
        //Runnable r = () -> { 
        //                      código 1;
        //                      código 2 ;
        //                  };
        System.out.println(pesquisa.filtra(p, a -> a.getIdade() > 18 ));

        System.out.println(pesquisa.filtra(p, a -> a.getNome().startsWith("A") ));

    }

}

class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    int getIdade(){
        return idade;
    }

    String getNome(){
        return nome;
    }

    public String toString(){
        return nome;
    }
}

class FiltradorDePessoas{

    List<Pessoa> filtra(List<Pessoa> pessoas, Predicate<Pessoa> criterio){

        List<Pessoa> resultado = new ArrayList<>();

        for(Pessoa p : pessoas){
            if (criterio.test(p)){
                resultado.add(p);
            }
        }

        return resultado;

    }

}