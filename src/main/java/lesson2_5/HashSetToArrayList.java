package lesson2_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArrayList {
    public static ArrayList convert(HashSet<String> cities, ArrayList<String> city_names) {
        return city_names = new ArrayList<>(cities);
    }

    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>(Arrays.asList("London", "Prague", "Washington", "Tashkent"));
        ArrayList<String> city_names = new ArrayList<>();
        System.out.println(convert(cities, city_names));
        System.out.println(city_names.toString());
    }
}
