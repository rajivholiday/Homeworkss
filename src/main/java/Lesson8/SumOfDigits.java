package Lesson8;

import java.util.Scanner;

public class SumOfDigits {
    public static int getSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("The sum of all digits in " + number + " is " + getSum(number));
    }
}
