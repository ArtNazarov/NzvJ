package MyApp;
import NzvJ.NzvApp;

public class MyApp {
    public static void main(String[] args) {
        // Simple console app 
        new NzvApp()
            .onCommand("test", params -> 
                System.out.println("Test route: " + params))
            .onCommand("other", MyApp::testHello)
            .process("test", "some test sentence")
            .process("other", "other phrase");
    }

    // Example of method
    public static void testHello(String params) {
        System.out.println("Hello, " + params);
    }
}
