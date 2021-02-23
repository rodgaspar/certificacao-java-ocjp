class Teste{
    //Variáveis Státicas e Locais com o mesmo nome - Ok
    static int i = 0;

    static void m1(int i){
        System.out.println("i: " + i);
        //System.out.println(this.i); // Erro - "this" é somente em objetos
        System.out.println("Teste.i: " + Teste.i);
        System.out.println();
    }

    int j;

    void m2(int j){
        System.out.println("i: " + i);
        System.out.println("This.i: " + this.i);
        System.out.println("Teste.i: " + Teste.i);
        System.out.println("j: " + j);
        System.out.println("this.j: " + this.j);
        //System.out.println(Testes.i); //Erro - variável membro não pode ser referênciada com o nome da classe
    }

    static void m3(){
        //System.out.println("this j: " + this.j); // Erro - métodos estáticos não podem referenciar variáveis de instância
    }

}

class ExEscopo1{        

    public static void main(String[] args){

        Teste.m1(2);

        new Teste().m2(4);

    }
}