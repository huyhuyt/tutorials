import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try (Scanner scanner = new Scanner(System.in)) {
            String a = scanner.next();
            int i = scanner.nextInt();
            String b = scanner.next();
            scanner.close();
            System.out.println("string: " + a);
            System.out.println("string: " + b);
            System.out.println("integer: " + i);
        } catch (Exception e)
        {
            
        }
    }
}
