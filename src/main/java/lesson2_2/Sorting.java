package lesson2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public ArrayList<String> sortNames(ArrayList<String> names) {
        Collections.sort(names);
        return names;
    }

    public static void main(String[] args) {
        Sorting sort_names = new Sorting();
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mike", "Tom", "Andrew", "John", "David", "Oliver"));
        System.out.println(sort_names.sortNames(names));


    }
}
