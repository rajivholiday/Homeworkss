package lesson2_5;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetSize {
    public static int numberOfElements(HashSet<Integer> numbers) {
        return numbers.size();
    }

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(8, 2, 4, 12, 10));
        System.out.println(numberOfElements(numbers));
    }
}
