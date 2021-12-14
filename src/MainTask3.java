import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class MainTask3 {
    public static void main(String[] args){
        int numberCounter = 1;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter how many random numbers you want:");
            int numberOfRandoms = scanner.nextInt();
            if (numberOfRandoms<0) throw new InputMismatchException();
            System.out.println("Enter the lower limit:");
            Integer lowerLimit = scanner.nextInt();
            System.out.println("Enter the upper limit:");
            Integer upperLimit = scanner.nextInt();
            if (lowerLimit>upperLimit) throw new InputMismatchException();
            System.out.println("Print from the new line? y or n");
            String typeYOrN = scanner.next();
            scanner.close();
            switch (typeYOrN) {
                case ("y"):
                    while (numberCounter <= numberOfRandoms) {
                       System.out.println(lowerLimit +  random.nextDouble()*(upperLimit - lowerLimit)+ " ");
                       numberCounter = numberCounter + 1;
                   }
                   break;
                case "n":
                    while (numberCounter <= numberOfRandoms) {
                       System.out.print(lowerLimit +  random.nextDouble()*(upperLimit - lowerLimit) + " ");
                       numberCounter = numberCounter + 1;
                    }
                   break;
                default:
                       System.out.println(" You should have entered y or n");
            }
        }
        catch (InputMismatchException ae){
            System.out.println("The impossible data is entered!");
        }

    }
}
    

