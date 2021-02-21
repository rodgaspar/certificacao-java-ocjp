public class Wrappers {

    public static void main(String[] args){       

        //Conversão wrapper p/ primitivo        
        Integer wrapperInt = new Integer("100");
        int primetivoInt = wrapperInt.intValue();
        System.out.println(primetivoInt + "\n");        

        //Conversão primitivo p/ wrapper
        int primetivoInt2 = 200;
        Integer wrapperInt2 = Integer.valueOf(primetivoInt2);       
        System.out.println(wrapperInt2 + "\n");        

        //Conversão string p/ wrapper        
        Integer wrapperInt3 = Integer.valueOf("300");       
        System.out.println(wrapperInt3 + "\n");        

        //Conversão wrapper p/ string
        Integer wrapperInt4 = new Integer(400);
        String wrapperStr = wrapperInt4.toString();       
        System.out.println(wrapperStr + "\n");        

        //Conversão primitivo p/ string
        int primitivoInt3 = 500;
        String wrapperStr2 = Integer.toString(primitivoInt3);       
        System.out.println(wrapperStr2 + "\n");  

        //Conversão string p/ primitivo        
        String wrapperStr5 = "600";
        int primetivoInt5 = Integer.parseInt(wrapperStr5);
        System.out.println(wrapperStr5 + "\n"); 
    }

}