class ExArrayReferencia{

    public static void main(String[] args){

        Cliente clientes[] = {new Cliente("Paula"), new Cliente("Fernando"),
                            new Cliente("Mario"), new Cliente("Maria")};

        for(Cliente cli : clientes){
            System.out.println(cli);
        }

        System.out.println();

        Object objetos[] = clientes;

        for(Object obj : objetos){
            System.out.println(obj);
        }

    }
    
}

class Cliente{

    private String nome;

    Cliente(String nome){
        this.nome = nome;
    }

    public String toString(){
        return this.nome;
    }

}