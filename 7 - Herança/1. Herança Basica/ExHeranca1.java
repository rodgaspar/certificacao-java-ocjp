import teste.*;

class A{

}

class B extends A {

    static void b(){
        System.out.println("Classe B");
    }

    public void imprime(){
        System.out.println("Imprime classe B");
    }

}

class C extends B{

    static void b(){
        System.out.println("Classe C");
    }
    
    //Erro - attempting to assign weaker access privileges; was public
    //protected void imprime(){
    //    System.out.println("Imprime classe C");
    //}

}

public class ExHeranca1{

    public static void main(String[] args){

        B b = new C();
        b.b();        
        b.imprime();

        System.out.println("");

        Teste a = new Teste();
        a.metodo();




    }

}