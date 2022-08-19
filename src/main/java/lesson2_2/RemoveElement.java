package lesson2_2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static ArrayList<Integer> removeThirdEl(ArrayList<Integer> numbers) {
        numbers.remove(2);
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(20, 2, 8, 50));
        System.out.println(removeThirdEl(numbers));


    }
}
