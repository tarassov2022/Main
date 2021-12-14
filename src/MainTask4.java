import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Enter the first number:");
        Integer typeFirstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        Integer typeSecondNumber = scanner.nextInt();
            System.out.println("the sum is " + Math.addExact(typeFirstNumber,typeSecondNumber));
            System.out.println("the product is " + Math.multiplyExact(typeFirstNumber,typeSecondNumber));
        }
        catch (InputMismatchException ae) {
            System.out.println("Enter between -2147483648 and 2147483647!");
        }
        catch (ArithmeticException ae) {
            System.out.println("The numbers you entered are too big!");
        }
        scanner.close();
    }
}
