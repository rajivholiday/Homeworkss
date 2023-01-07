
import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = {
                {"Sunday", "do homework"},
                {"Monday", "reading"},
                {"Tuesday", "walking"},
                {"Wednesday", "exercising"},
                {"Thursday", "cooking"},
                {"Friday", "watching TV"},
                {"Saturday", "relax"},
        };
        while (true) {
            System.out.println("Please, input the day of the week:");
            String day = scanner.nextLine();
            day = day.toLowerCase();

            if (day.isEmpty()) {
                break;
            }

            switch (day) {
                case "sunday":
                    System.out.printf("Your task for %s: %s\n", schedule[0][0], schedule[0][1]);
                    break;
                case "monday":
                    System.out.printf("Your task for %s: %s\n", schedule[1][0], schedule[1][1]);
                    break;

                case "tuesday":
                    System.out.printf("Your task for %s: %s\n", schedule[2][0], schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.printf("Your task for %s: %s\n", schedule[3][0], schedule[3][1]);
                    break;
                case "thursday":
                    System.out.printf("Your task for %s: %s\n", schedule[4][0], schedule[4][1]);
                    break;
                case "friday":
                    System.out.printf("Your task for %s: %s\n", schedule[5][0], schedule[5][1]);
                    break;
                case "saturday":
                    System.out.printf("Your task for %s: %s\n", schedule[6][0], schedule[6][1]);
                    break;
                default:
                    System.out.println("I don't understand you,please try again");
            }
        }
    }
}