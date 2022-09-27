package lesson2_5;


import java.util.Arrays;
import java.util.HashSet;

public class HashSetClone {
    public static HashSet<String> makeClone(HashSet<String> names1) {
        HashSet<String> names2 = new HashSet<>();
        return names2 = (HashSet<String>) names1.clone();
    }

    public static void main(String[] args) {
        HashSet<String> names1 = new HashSet<>(Arrays.asList("Mike", "Max", "Dorothy", "Mary"));
        HashSet<String> names2 = (HashSet<String>)names1.clone();
        System.out.println(names2);
        System.out.println(names2.add("Ajay"));
        System.out.println(names2);




    }
}
