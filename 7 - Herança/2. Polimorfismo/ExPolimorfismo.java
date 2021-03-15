import java.io.*;

class Veiculo{

    void liga() throws IOException{
        System.out.println("Ligando veiculo...");
    }

    Veiculo fabrica(){
        return new Veiculo();
    }

}

class Carro extends Veiculo{

    void liga() throws FileNotFoundException{
        System.out.println("Ligando carro...");        
    }

}

class Moto extends Veiculo{

    void liga(){
        System.out.println("Ligando moto...");        
    }

    Moto fabrica(){
        return new Moto();
    }
    
}

class ExPolimorfismo{

    static void imprime(Veiculo veiculo) throws IOException {
        veiculo.liga();
    }

    static public void main(String[] args) throws IOException{

        imprime(new Veiculo());
        imprime(new Carro());
        imprime(new Moto());

        System.out.println();

        Veiculo v = new Veiculo().fabrica();
        v.liga();

        Veiculo c = new Carro().fabrica();
        c.liga();

        Veiculo m = new Moto().fabrica();
        m.liga();

    }
}