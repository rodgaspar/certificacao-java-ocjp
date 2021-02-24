class ExString1{

    public static void main(String[] args){

        String vazio = null;
        String full = "Bem-vindo " + vazio;
        System.out.println(full);
        System.out.println();

        // Formas de inicializar uma String
        String s1 = "Java";
        String s2 = new String("Java");

        char c1[] = {'J','a','v','a'};
        String s3 = new String(c1);

        StringBuilder sb1 = new StringBuilder("Java");
        String s4 = new String(sb1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println();
        
        // Concatenação
        String s5 = "Prova" + " de Certificação " + "Java ";
        System.out.println(s5);

        String nula = null;        
        s5 = "Testando s10 " + nula;        
        System.out.println(s5);

        System.out.println(1500 + " Certificação");
        System.out.println(15 + 00 + " Certificação");      // Da esquerda para a direita
        System.out.println(1 + 500 + " Certificação");
        System.out.println(15 + (0 + (0 + " Certificação")));

        // Strings são imutáveis
        // Métodos mains importantes

        String s6 = "  1234testando  ".toUpperCase().trim();
        System.out.println(s6);
        System.out.println(s6.charAt(3));
        System.out.println(s6.length());
        System.out.println("".isEmpty());
        System.out.println(s6.isEmpty());
        s6 += "  Nova String 111";
        System.out.println(s6);
        System.out.println(s6.substring(1,4));
        System.out.println(s6.replace("1","9"));

        //Comparação
        String texto = "Certificado";
        System.out.println(texto.equals("Certificado")); // true
        System.out.println(texto.equals("certificado")); // false
        System.out.println(texto.equalsIgnoreCase("certificado"));//true

        System.out.println(texto.compareTo("Arnaldo")); // 2
        System.out.println(texto.compareTo("Certificado")); // 0
        System.out.println(texto.compareTo("Grécia")); // -4

        System.out.println(texto.compareTo("certificado")); // -32

        System.out.println(texto.compareToIgnoreCase("certificado"));//0

        //Busca        
        texto = "Pretendo fazer a prova de certificação de Java";

        System.out.println(texto.indexOf("Pretendo")); // imprime 0
        System.out.println(texto.indexOf("Pretendia")); // imprime -1
        System.out.println(texto.indexOf("tendo")); // imprime 3

        System.out.println(texto.indexOf("a")); // imprime 10
        System.out.println(texto.lastIndexOf("a")); // imprime 45
        System.out.println(texto.lastIndexOf("Pretendia")); //imprime -1

        System.out.println(texto.startsWith("Pretendo")); // true
        System.out.println(texto.startsWith("Pretendia")); // false

        System.out.println(texto.endsWith("Java")); // true
        System.out.println(texto.endsWith("Oracle")); // false



    }

}