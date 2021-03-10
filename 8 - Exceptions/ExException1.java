import java.io.*;

class ExExcepetion1{

    public static void main(String[] args){
        m1();

        try{
            new AcessoAoArquivo();
        } catch (IOException ex) {
            System.out.println("Segundo catch executado com sucesso!");
        }
    }

    static void m1(){
        try{
            new Conta().saque(200.00);
        } catch (IllegalArgumentException ex){
            System.out.println("Primeiro catch executado com sucesso!");
        }
    }    

}

class Conta{
    double saldo = 100;

    void saque(double valor){
        if(valor > this.saldo){
            throw new IllegalArgumentException("Saque maior que o saldo da conta");
        }
    }
}


class AcessoAoArquivo {
    // não compila, pois ao instanciar, pode dar IOException,
    // mas o construtor não fala nada
    private InputStream is = new FileInputStream("entrada.txt"); 

    // incluir throws nos construtores
    AcessoAoArquivo() throws IOException{
        super();
    }
}