package Lesson8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a degree fahrenheit:");
        DecimalFormat df = new DecimalFormat("0.0#");
        double f = scanner.nextDouble();
        double c = (f - 32) * 0.5556;
        System.out.println(df.format(f) + " degree Fahrenheit is equal to " + df.format(c) + " in Celcius");
    }
}


