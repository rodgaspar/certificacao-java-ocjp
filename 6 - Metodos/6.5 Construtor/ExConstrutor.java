class ExConstrutor {
    Teste() {
        this(valor()); // valor não é estático, não compila
    }

    private String valor() {
        return "valor...";
    }

    Teste(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Teste();
    }
}