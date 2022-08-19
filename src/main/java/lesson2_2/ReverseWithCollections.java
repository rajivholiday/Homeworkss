package lesson2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseWithCollections {
    public static ArrayList<Integer> rev(ArrayList<Integer> numbers) {
        ArrayList<Integer> reverse_numbers = new ArrayList<>(numbers);
        Collections.reverse(reverse_numbers);
        return reverse_numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> reverse_numbers = rev(numbers);

        System.out.printf("Elements of the array: %s \n", numbers.toString());
        System.out.printf("Elements of the reverse array: %s", reverse_numbers.toString());

    }
}
