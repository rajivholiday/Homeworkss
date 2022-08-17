package lesson2_2;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public ArrayList<Integer> removeThirdEl(ArrayList<Integer> numbers) {
        numbers.remove(2);
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(20, 2, 8, 50));
        RemoveElement new_arr = new RemoveElement();
        System.out.println(new_arr.removeThirdEl(numbers));

    }
}
