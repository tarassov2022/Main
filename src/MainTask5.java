import java.util.InputMismatchException;
import java.util.Scanner;
public class MainTask5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the month number:");
    try {
    int monthNumber = scanner.nextInt();
    scanner.close();
    System.out.println(switch(monthNumber){
        case 1 ->"Jan";
        case 2 ->"Feb";
        case 3 ->"Mar";
        case 4 ->"Apr";
        case 5 -> "May";
        case 6 -> "Jun";
        case 7 -> "Jul";
        case 8 -> "Aug";
        case 9 -> "Sept";
        case 10 -> "Oct";
        case 11 -> "Nov";
        case 12 -> "Dec";
        default -> "Enter between 1 and 12";

    });}
    catch(InputMismatchException ae) {
        System.out.println("Enter the integer between 1 and 12!");
    }
}
}
