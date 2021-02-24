class ExVarArgs1{

    public static void main(String... args){

        A a = new A();
        a.imprime("Rodrigo");
        a.imprime("Rodrigo", 1);
        a.imprime("Rodrigo", 1 , 2);
        a.imprime("Rodrigo", 1 , 2 , 3);
        a.imprime("Rodrigo", new int[]{1 , 2 , 3});

    }

}

class A{
    void imprime(String nome, int... contadores){
        System.out.println("Nome: " + nome);

        for(int contador: contadores){
            System.out.println(contador);
        }

        System.out.println();

    }

    void imprime(String nome){
        System.out.println("Nome sem varargs: " + nome);
        System.out.println();

    }
}