package Lesson8;

import java.util.Scanner;

public class SumOfDigits {
    public static int getSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 0 and 1000");
        int number = scanner.nextInt();
        System.out.println(getSum(number));

    }
}