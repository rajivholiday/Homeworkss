package lesson2_5;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {
    public static String[] convert1(HashSet<String> names1, String[] names2) {
        int i = 0;
        names2 = new String[names1.size()];
        for (String s : names1) {
            names2[i++] = s;
        }
        return names2;
    }

    public static String[] convert2(HashSet<String> numbers1, String[] numbers2) {
        numbers2 = new String[numbers1.size()];
        return numbers1.toArray(numbers2);
    }

    public static void main(String[] args) {
        HashSet<String> names1 = new HashSet<>(Arrays.asList("Tom", "Kate", "Toni"));
        String[] names2 = new String[names1.size()];
        System.out.println(convert1(names1, names2));
    }

}
