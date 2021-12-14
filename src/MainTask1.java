import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Name:");
    String typeName = scanner.next();
    scanner.close();
    System.out.println("Hello," + typeName);

}
}
