package Lesson8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InchToMeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value for inch:");
        double inch = scanner.nextDouble();
        double meter = inch * 0.254;
        DecimalFormat df = new DecimalFormat("0.0#");
        System.out.printf("%f inch is %d meters", df.format(inch), df.format(meter));

    }
}
