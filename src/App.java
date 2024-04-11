import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties(System.getProperties());
        System.out.println("Betriebssystem: " + properties.getProperty("os.name"));
        System.out.println("Java-Version: " + properties.getProperty("java.version"));
        System.out.println("Username: " + properties.getProperty("user.name"));
    }
}
