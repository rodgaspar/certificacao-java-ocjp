class ExString2 {

    public static void main(String[] args){

        //Cria 2 objetos, um literal (que vai para o pool) e o outro 
        //com o new
        String h = new String ("hello ");

        //nenhum objeto criado, usa o mesmo do pool
        String h1 = "hello ";
        //novo objeto criado e inserido no pool
        String w = "world"; 

        //nenhum  objeto criado, usa do pool
        System.out.println("hello ");

        //criado um novo objeto resultante da concatenação,
        // mas este não vai para o pool
        System.out.println(h1 + "world");

        //Novo objeto criado e colocado no pool (Hello com H maiúsculo).
        System.out.println("Hello " == h1);     // 1

    }

}