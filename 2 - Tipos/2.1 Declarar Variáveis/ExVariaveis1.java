class ExVariaveis1{

    static public void main(String[] args){

        //float f = 12.2; // Erro - não converte float para double automaticamente
        float f = 12.2f;

        byte b = 127;
        short s = 220;

        System.out.println(0b10); // 2   Binário
        System.out.println(010);  // 8   Octal 
        System.out.println(0xA);  // 10  Hexa
        System.out.println(3.1E2);  // 310.0  Notação ciêntifica   (só para double)
        System.out.println(3.1E1);  // 31.0  Notação ciêntifica
        System.out.println(3.1E4);  // 31000.0  Notação ciêntifica
        System.out.println(100_200_300);  // 100.200.300
    }

}