public class App {
    public static void main(String[] args) throws Exception {
        beispieleFuerPrintF();
    }

    public static void beispieleFuerPrintF() {
        String article = "Buch";
        float price = 33.75f;

        System.out.println("Das " + article + " kostet " + price + " Euro");
        System.out.printf("Das %s kostet %.2f Euro\n", article, price);
    }

    public static void steuerZeichen() {
        System.out.println("Max sagt:");
        System.out.println("\t\"Hello, World!\"");
        System.out.println("Lisa antwortet:\n\t\'Hallo Max!\'");
        System.out.println("Meine Festplatte lautet: C:\\");
    }

}
