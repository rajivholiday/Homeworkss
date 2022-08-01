package Lesson8;
import java.text.DecimalFormat;

public class DcFormat {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("0.00#");
        DecimalFormat df = new DecimalFormat("0.0#");
        DecimalFormat df1 = new DecimalFormat("0.#");

        double d = 12.00000000;
        System.out.println(df2.format(d));
        System.out.println(df.format(d));
        System.out.println(df1.format(d));


    }
}
