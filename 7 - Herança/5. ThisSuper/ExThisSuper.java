class Veiculo{

    int velocidade = 50;

    Veiculo(){
        System.out.println("Iniciando Construtor Veiculo...");
    }

    {
        System.out.println("Iniciando Instancia Classe Veiculo...");
    }

    static {
        System.out.println("Iniciando static da Classe Veiculo...");
    }

}
class Carro extends Veiculo{
    
    int velocidade = 100;

    Carro(){
        System.out.println("Iniciando Contrutor Carro...");
    }

    {
        System.out.println("Iniciando Instancia Classe Carro...");
    }

    static {
        System.out.println("Iniciando static da Classe Carro...");
    }

    void acelerar(int velocidade){
        System.out.println(velocidade);
        System.out.println(this.velocidade);
        System.out.println(super.velocidade);
    }

}

public class ExThisSuper{

    public static void main(String[] args){

        Carro c = new Carro();
        c.acelerar(200);

        System.out.println();
        c.velocidade = 51;
        c.acelerar(200);

        System.out.println();
        ((Veiculo)c).velocidade = 52;
        c.acelerar(200);

    }

}