import java.util.Random;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int random = rand.nextInt(100);

        System.out.println("Let the game begin!");
        System.out.println("What is your name:");
        String name = scanner.nextLine();
        while (true) {
            System.out.println("Enter the number:");
            int number = scanner.nextInt();

            if (number < random) {
                System.out.println("Your number is too small.Please try again!");
            } else if (number > random) {
                System.out.println("Your number is too big.Please try again!");
            } else {
                break;
            }
        }
        System.out.printf("Congratulations %s!", name);
    }
}
