
package Lesson8;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = createData();
        while (true) {
            System.out.println("Please, input the day of the week:");
            String day = scanner.next();
            if (day.equals("exit")) break;
            System.out.println(checkResult(day, schedule));
        }
    }

    public static String[][] createData() {
        String[][] schedule = new String[7][2];
        schedule[0][0] = WeekD
        schedule[0][1] = "do home work";
        schedule[1][0] = "monday";
        schedule[1][1] = "go to courses";
        schedule[2][0] = "tuesday";
        schedule[2][1] = "go to academy";
        schedule[3][0] = "wednesday";
        schedule[3][1] = "watch a film";
        schedule[4][0] = "thursday";
        schedule[4][1] = "read a book";
        schedule[5][0] = "friday";
        schedule[5][1] = "go to gym";
        schedule[6][0] = "saturday";
        schedule[6][1] = "rest";
        return schedule;
    }

    public static String checkResult(String dayOfWeek, String[][] schedule) {

        return switch (WeekDays.valueOf());
            case "sunday" -> printing(schedule[0][0], schedule[0][1]);
            case "monday" -> printing(schedule[1][0], schedule[1][1]);
            case "tuesday" -> printing(schedule[2][0], schedule[2][1]);
            case "wednesday" -> printing(schedule[3][0], schedule[3][1]);
            case "thursday" -> printing(schedule[4][0], schedule[4][1]);
            case "friday" -> printing(schedule[5][0], schedule[5][1]);
            case "saturday" -> printing(schedule[6][0], schedule[6][1]);
            default -> "Sorry, I don't understand you, please try again.";
        };
    }

    public static String printing(String dayOfWeek, String task) {
        return String.format("Your task for %s: %s\n", dayOfWeek, task);
    }
}
