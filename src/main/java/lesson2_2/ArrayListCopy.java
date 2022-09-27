package lesson2_2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCopy {
    public ArrayList<String> makeArrayCopy(ArrayList<String> cities) {
        ArrayList<String> capitalCities = new ArrayList<>(cities);
        return capitalCities;

    }

    public static void main(String[] args) {
        ArrayListCopy copy = new ArrayListCopy();
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("London", "New York", "Beijing", "Ankara", "Prague"));
        System.out.println(copy.makeArrayCopy(cities));

    }
}
