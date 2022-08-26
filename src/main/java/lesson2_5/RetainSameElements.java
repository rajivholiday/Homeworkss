package lesson2_5;

import java.util.Arrays;
import java.util.HashSet;

public class RetainSameElements {
    public static HashSet<String> sameElements(HashSet<String> names1, HashSet<String> names2) {
        names1.retainAll(names2);
        return names1;
    }

    public static void main(String[] args) {
        HashSet<String> names1 = new HashSet<>(Arrays.asList("Tom", "Daniel", "Mike", "Max", "Kate", "Mary"));
        HashSet<String> names2 = new HashSet<>(Arrays.asList("Joseph", "Daniel", "Mike", "Max", "Dorothy"));
        System.out.println(sameElements(names1, names2));
    }

}
