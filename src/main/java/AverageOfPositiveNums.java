import java.util.Scanner;

public class AverageOfPositiveNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an input");
        int sum = 0;
        int count = 0;
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (input > 0) {
                sum += input;
                count++;
            }
        }
            if (count == 0) {
                System.out.println("Can not calculate the average");
            }
            else{
                System.out.println((double) sum / count);
            }
        System.out.println(count);

    }
}