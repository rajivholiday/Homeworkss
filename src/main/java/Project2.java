import java.util.Random;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int r_num;
        int c_num;
        int x = random.nextInt(4) + 1;
        int y = random.nextInt(4) + 1;
        String[][] board = {
                {"0", "1", "2", "3", "4", "5"},
                {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"},
                {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"},
                {"5", "-", "-", "-", "-", "-"},
        };
        System.out.println("All set. Get ready to rumble!");
        while (true) {
            System.out.println("Enter row number from 1 to 5");
            r_num = scanner.nextInt();
            if (r_num >= 1 && r_num <= 5) {
                break;
            }
            System.out.println("Wrong number!");
        }
        while (true) {
            System.out.println("Enter column number from 1 to 5");
            c_num = scanner.nextInt();
            if (c_num >= 1 && c_num <= 5) {
                break;
            }
        }
        System.out.println("Wrong number!");

        while (true) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Enter a number");
            x = scanner.nextInt();
            System.out.println("Enter a number");
            y = scanner.nextInt();
            board[x][y] = "*";




        }

    }
}
