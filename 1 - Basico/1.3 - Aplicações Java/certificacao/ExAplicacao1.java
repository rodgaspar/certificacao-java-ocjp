//Para conseguir executar, é necessário ter a estrtura de classes identica ao de pacotes 
// e executar o diretório raiz

// É possível passar propriedades para o pgm na execução por linha de comando através do -D
// Ex. java -Dambiente=produção certificao.ExAplicacao primeiro segundo

// É possível definir o classpah da aplicação atráves do parâmetro "-cp" ou "-classpath"
// Ex: java -cp certificacao -Dambiente=producao certificacao.ExAplicacao1 primeiro segundo

package certificacao;

class ExAplicacao1{

    public static void main (String[] args){

        System.out.println("Iniciando processamento...");
        System.out.println("Qtd de args: " + args.length);

        for(int i=0;i < args.length; i++){
            
            System.out.println("Args(" + i + "): "  + args[i]);

        }

    }

}