abstract class Veiculo{

    int x = 30;
    static int y = 50;

    void ligar(){
        System.out.println("Lingando o veiculo...");
    }

    abstract void desligar();

}

class Carro extends Veiculo{

    void desligar(){
        System.out.println("Deslingando carro...");
    }

}

class ExAbstract{

    public static void main(String[] args){

        Carro c = new Carro();
        c.ligar();
        Veiculo v = new Carro();
        v.desligar();

        System.out.println(v.x);
        // System.out.println(Veiculo.x); nao eh estatica
        System.out.println(Veiculo.y);

    }
}