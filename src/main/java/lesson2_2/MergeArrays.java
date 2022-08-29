package lesson2_2;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {
    public ArrayList<String> mergeArrays(ArrayList<String> cities1,ArrayList<String> cities2) {
       cities2.addAll(cities1);
       return  cities2;

    }

    public static void main(String[] args) {
        ArrayList<String> cities1 = new ArrayList<>(Arrays.asList("Tokyo", "Islamabad", "Oslo", "Roma"));
        ArrayList<String> cities2 = new ArrayList<>(Arrays.asList("Baku", "Minsk", "Madrid"));



    }
}
