public class Main {
    public static void main(String[] args) {
        
        String messaggio = "Hello, world!";

        // Using an anonymous class
        FunctionalInterface MyFunctionalInterface = new FunctionalInterface() {
            @Override 
            public void method(String msg) {
                System.out.println(msg);
            }
        };

        // Using lambda expression (Per interfacce funzionali, con un solo metodo)
        FunctionalInterface lambda = (msg) -> {
            System.out.println(msg);
        };

        // oppure
        // FunctionalInterface lambda = msg -> System.out.println(msg);

        MyFunctionalInterface.method(messaggio + " Classe Anonima.");
        lambda.method(messaggio + " Espressione Lambda");
    }
}
