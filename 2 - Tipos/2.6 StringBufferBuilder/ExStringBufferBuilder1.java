class ExStringBufferBuilder{

    public static void main(String[]args){

        // StringBuffer é mult thread
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.toString());

        sb = new StringBuffer("Testando...");
        sb.append("1, ");
        sb.append("2, ");
        sb.append("3 e já!!");
        System.out.println(sb.toString());

        sb = new StringBuffer(10);
        sb.append("Agora sim!!!!!!");
        System.out.println(sb.toString());
        System.out.println();

        // StringBuilder não trata mult-thread
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.toString());

        sb1 = new StringBuilder("Testando...");
        sb1.append("1, ");
        sb1.append("2, ");
        sb1.append("3 e já!!");
        System.out.println(sb1.toString());

        sb1 = new StringBuilder(10);
        sb1.append("Agora sim!!!!!!");
        System.out.println(sb1);

        // Append aceita char ou qualquer object 
        sb1.append('A');
        System.out.println(sb1);
        sb1.append(sb);
        System.out.println(sb1);

        // Método "delete"
        System.out.println(sb1.delete(6, sb1.length()));

        // Método "insert"
        System.out.println(sb1.insert(2, "..."));

        // Método "reverse"
        System.out.println(sb1.reverse());

    }

}