package Lesson8;

import java.util.Scanner;

public class DigitCounter {
    public static int countDigit(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println(countDigit(number));

    }
}
