package Lesson8;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a degree fahrenheit:");

        double f = scanner.nextDouble();
        double c = (f - 32) * 0.5556;
        System.out.printf("%.1f fahrenheit is equal to %.1f in Celcius", f, c);
    }
}


