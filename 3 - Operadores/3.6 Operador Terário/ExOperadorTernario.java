class ExOperadorTernario{

    public static void main(String[]args){

        int i = 99;
        double resultado = i == 9 ? 100 : i == 99 ? 20 : 10.0;
        System.out.println(resultado);

        System.out.println();
        i = 1;
        System.out.println(i);
        resultado = ++i == 2 ? 100 : i == 2? 1:0 ;
        System.out.println(i);

        System.out.println(resultado);

    }

}