package casting;

interface Automatico{}
class Veiculo{}
class Carro extends Veiculo{}
class CarroAutomatico extends Veiculo implements Automatico{}
class Moto extends Veiculo{}


class ExCasting{

    public static void main(String[] args){

        Veiculo v1 = new Carro();
        Carro c1 = (Carro)v1;

        Veiculo v2 = new Carro();
        //Moto c2 = (Moto)v2; // Erro de execução

        //Carro v3 = new Carro();
        //Moto c3 = (Moto)v3; // Erro de compilação

        Automatico c4 = new CarroAutomatico();
        Moto m4 = (Moto)c4;


    }

}