class Pessoa {

    private String nome;

    Pessoa(String nome){
        this.nome = nome;
    }

    public boolean equals(Object o){
        
        if (! (o instanceof Pessoa)) {
            return false;
        }

        Pessoa outro = (Pessoa)o;
        return this.nome == outro.nome;
    }

}

public class ExEquals{

    public static void main(String[] args){

        Pessoa p1 = new Pessoa("Fábio");
        Pessoa p2 = new Pessoa("Carla");
        Pessoa p3 = new Pessoa("Fábio");

        System.out.println(p1 == p1);
        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));

    }

}