class Veiculo{
    static int TotalDeVeiculos = 10;

    static String acelerar(){
        return "Acelerando Veiculo...";
    }

}

class Carro extends Veiculo{
    static int TotalDeVeiculos = 8;

    static String acelerar(){
        return "Acelerando Carro...";
    }

}

class Moto extends Veiculo{
    // variável é permitido ter o mesmo nome de outra estática
    int TotalDeVeiculos = 2;

    // Erro não é possível sobreescrever método estático
    // String acelerar(){
    //     return "Acelerando Moto...";
    // }

}

class ExMetodos{

    public static void main(String[] args){
        System.out.println(Veiculo.TotalDeVeiculos);
        System.out.println(Carro.TotalDeVeiculos);
        System.out.println(Veiculo.acelerar());
        System.out.println(Carro.acelerar());
        
        System.out.println();

        Veiculo v = new Veiculo();
        Carro c = new Carro();
        Veiculo vc = new Carro();

        System.out.println(v.TotalDeVeiculos);
        System.out.println(c.TotalDeVeiculos);
        System.out.println(v.acelerar());
        System.out.println(c.acelerar());
        System.out.println(vc.acelerar());
    }

}