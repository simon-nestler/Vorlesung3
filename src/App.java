public class App {
    public static void main(String[] args) throws Exception {
        beispieleFuerSteuercodes();
    }

    public static void beispieleFuerSteuercodes() {
        String article = "Buch";
        float price = 33.32499f;
        char c = 'A';
        int i = 68;

        System.out.printf("Dieser Wert wird ausgegeben %C", i);
        System.out.println();
    }

    public static void beispieleFuerPrintF() {
        String article = "Buch";
        String article23 = "Buch23";
        float price = 33.32499f;

        System.out.printf("Das %10s kostet %10.2f Euro\n", article, price);
        System.out.printf("Das %10s kostet %10.2f Euro\n", article23, price);
    }

    public static void steuerZeichen() {
        System.out.println("Max sagt:");
        System.out.println("\t\"Hello, World!\"");
        System.out.println("Lisa antwortet:\n\t\'Hallo Max!\'");
        System.out.println("Meine Festplatte lautet: C:\\");
    }

}
