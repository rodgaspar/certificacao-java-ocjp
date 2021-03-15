interface Veiculo{

    int x = 30;
    static int y = 50;

    default void ligar(){
        System.out.println("Lingando o veiculo...");
    }

    abstract void desligar();

    static void acelerar(){
        System.out.println("Acelerando o veiculo...");
    }   

}

abstract class Carro implements Veiculo{

    public void desligar(){};

}

class Corsa extends Carro{

    public void desligar(){
        System.out.println("Deslingando carro...");
    }

}

abstract class Moto implements Veiculo{

}

class ExInterfaces{

    public static void main(String[] args){

        Carro c = new Corsa();
        c.ligar();
        //c.acelerar(); Não compila
        Veiculo v = new Corsa();
        v.desligar();
        //v.acelerar();    Não compila
        Veiculo.acelerar();

        System.out.println(v.x);
        System.out.println(Veiculo.x); 
        System.out.println(Veiculo.y);

        //Veiculo.x = 50; // Não compila. variavel Final

    }
}