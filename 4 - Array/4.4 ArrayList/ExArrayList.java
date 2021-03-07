import java.util.ArrayList;
import java.util.Iterator;

class ExArrayList{

    public static void main(String[] args){

        ArrayList<String> paises = new ArrayList<>();
        
        paises.add("Brasil");
        paises.add("Alemanha");
        paises.add("Austrália");

        for(String pais : paises){
            System.out.println(pais);
        }

        System.out.println();
        boolean removido = paises.remove("Austrália");        
        System.out.println(removido);

        for(String pais : paises){
            System.out.println(pais);
        }

        System.out.println();
        paises.add(1,"Chile");

        for(String pais : paises){
            System.out.println(pais);
        }

        System.out.println();
        paises.remove(2);

        for(String pais : paises){
            System.out.println(pais);
        }

        System.out.println();
        System.out.println(paises.contains("Chile"));
        System.out.println(paises.indexOf("Chile"));
        System.out.println(paises.size());
        System.out.println(paises.get(1));


        System.out.println();
        String[] nomePaises = paises.toArray(new String[0]);
        for(String pais : nomePaises){
            System.out.println(pais);
        }

        System.out.println();
        Carro gol = new Carro("Gol","WV",1990);
        Carro palio = new Carro("Palio","Fiat",1995);
        Carro corsa = new Carro("Corsa","GM",2000);
        Carro fiesta = new Carro("Fiesta","Ford",2005);
        Carro newFiesta = new Carro("Fiesta","Ford",2012);

        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(gol);
        carros.add(palio);
        carros.add(corsa);
        carros.add(fiesta);
        carros.add(newFiesta);

        System.out.println(carros.contains(fiesta));

        Iterator<Carro> carIterator = carros.iterator();

        while (carIterator.hasNext()) {
            System.out.println(carIterator.next().getModelo());
        }

    }
}

class Carro{
    private String modelo;
    private String montadora;
    private int ano;

    Carro(String modelo, String montadora, int ano){
        this.modelo = modelo;
        this.montadora = montadora;
        this.ano = ano;
    }

    String getModelo(){
        return this.modelo;
    }
}