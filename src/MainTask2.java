import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something:");
            String string = new StringBuilder(scanner.nextLine()).reverse().toString();
            scanner.close();
        System.out.println(string);

    }
}
