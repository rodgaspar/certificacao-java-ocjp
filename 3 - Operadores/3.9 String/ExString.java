class ExString {

    public static void main(String[] args){

        String s0 = new String("Teste");
        String s1 = "Teste";
        String s2 = "Teste";
        String s3 = new String("Teste");
        String s4 = "Tes" + "te";
        String s5 = "Tes";
        String s6 = s5 + "te";
        String s7 = "texto";
        String s8 = "Texto";


        System.out.println(s0 == s1);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == "Teste");
        System.out.println(s3 == "Teste");
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println(s1 == s6);
        System.out.println(s7.toLowerCase() == s7);
        System.out.println(s8.toLowerCase() == s8);


    }

}