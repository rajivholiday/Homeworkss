package Lesson8;

import java.util.Scanner;

public class InchToMeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value for inch:");
        float inch = scanner.nextFloat();
        float meter = inch * 0.254f;
        System.out.printf("%f inch is %f meters", inch, meter);

    }
}
