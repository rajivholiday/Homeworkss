package Lesson8;

import java.util.Scanner;

public class InchToMeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value for inch:");
        double inch = scanner.nextDouble();
        double meter = inch * 0.0254;

        System.out.printf("%.1f is %.1f meters", inch, meter);

    }
}
