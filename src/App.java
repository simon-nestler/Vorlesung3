import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        beispielePrintWriter();
    }

    public static void beispielePrintWriter() {
        PrintWriter out;
        try {
            Properties props = System.getProperties();
            String os = props.getProperty("os.name");

            System.out.println("Betriebssystem: " + os);

            String home = System.getProperty("user.home");
            out = new PrintWriter("abcdef.txt");

            out.println("Hallo Welt");
            double price = 33.32499;
            out.printf("Das Buch kostet %.2f Euro\n", price);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
            e.printStackTrace();
        }
    }

    public static void beispieleFuerSteuercodes() {
        char c = 'A';
        Calendar cal = Calendar.getInstance();

        System.out.printf("Aktuelle Uhrzeit: %TH:%<TM:%<TS%n", cal);
        System.out.printf("Aktueller Tag: %Td.%<Tm.%<TY%n", cal);
        System.out.printf("%TR%n", cal);
        System.out.printf("%TT%n", cal);
        System.out.printf("%TD%n", cal);
        System.out.printf("%TF%n", cal);
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
