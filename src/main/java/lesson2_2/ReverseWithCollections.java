package lesson2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseWithCollections {
    public ArrayList<Integer> rev(ArrayList<Integer> numbers) {
        ArrayList<Integer> reverse_numbers = new ArrayList<>(numbers);
        Collections.reverse(reverse_numbers);
        return reverse_numbers;
    }

    public static void main(String[] args) {
        ReverseWithCollections obj = new ReverseWithCollections();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> reverse_numbers = obj.rev(numbers);

        System.out.print("Elements before reversing " + numbers + "\n");
        System.out.print("Elements after reversing " + reverse_numbers);


    }
}
