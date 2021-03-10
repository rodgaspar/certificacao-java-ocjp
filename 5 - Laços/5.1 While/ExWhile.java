class ExWhile{

    public static void main(String[] args){

        //unreachable statement, não compila.
        while(false) { 
            System.out.println("Teste"); 
        } 

        //unreachable statement, não compila.
        while(1 > 2) {
            System.out.println("Teste"); 
        } 

        //compila, mas nunca executa
        int a = 1;
        int b = 2;
        while(a > b){ 
            System.out.println("OI");
        }

    }

    int a() {
        while(true) { //nunca fica false
            System.out.println("Faz algo");
        }
        return 1; // não compila, nunca chegará aqui
    }

    int b() {
        final boolean RODANDO = true;
        while(RODANDO) {
            System.out.println("Faz algo");
        }
        return 1; // não compila, nunca chegará aqui
    }

    int c() {
        boolean rodando = true; // não final
        while(rodando) {
            System.out.println("Faz algo");
        }
        return 1; 
        // compila, não tem como saber se o valor de rodando
        // vai mudar
    }

}