package Lesson8;

import java.util.Scanner;

public class MinutToYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        int minut = scanner.nextInt();
        double year = minut/525600;
        int days = (int) (minut/60/24)%365;
        System.out.printf("%d is %f years and %d days", minut, year, days);


    }
}