class Veiculo{

    void acelera(Object o, String s){
        System.out.println("Executando object, String");
    }

    void acelera(String s, Object o){
        System.out.println("Executando String, Object");
    }

    void acelera(int i, double d){
        System.out.println("Executando int, double");
    }

    void acelera(double d , int i){
        System.out.println("Executando double, int");
    }

}

class ExSobrecarga{

    public static void main(String[] args){

        Veiculo veiculo = new Veiculo();
        veiculo.acelera(new Object(), new String());
        veiculo.acelera( new String(), new Object());
        // veiculo.acelera( new String(), new String()); // Erro: reference to acelera is ambiguous        
        // veiculo.acelera(4, 2); // Erro: reference to acelera is ambiguous        

    }

}