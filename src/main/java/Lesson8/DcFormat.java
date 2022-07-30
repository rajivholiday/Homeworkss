package Lesson8;

import java.text.DecimalFormat;

public class DcFormat {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0#");
        double d = 12.00000000;
        System.out.println(df.format(d));
    }
}
