//Tudo é opcional. O arquivo compila mesmo se estiver vázio

//package br.com.rcgasp.certificacao;  // Opcional, mas sempre em primeiro
//Ao executar, o .class precisa estar em uma estrtura de diretórios igual a nome do package

import java.time.*;  // Sempre em segundo

/** Java doc */

class /* comentario no meio da classe */ ExEstrutura1 {

    public static void main(String[] args){
        
        new B().B();

        System.out.println(C.getIdadeInterface());

    }

}

//public class B{ 
// a classe só pode ser public se o nome do arquivo for igual
// ou seja, só depos existir 1 classe/interface/enum pública
class B{
    int B; // Ok - é possível ter uma variável com o mesmo nome da classe

    void B() { // Ok -  é possível ter um método com o mesmo nome da classe
        System.out.println(B);
    }

}

//váriaveis e métodos de interfaces sempre são públicos por padrão
//Variaveis em interfaces são sempre final e statics por padrão
interface C{
    int idadeInterface =5; 

    int i(); //metodos por padrao são abstracts

    static int getIdadeInterface(){
        return idadeInterface;
    }
}