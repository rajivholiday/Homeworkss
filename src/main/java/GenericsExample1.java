import java.util.ArrayList;
import java.util.Arrays;

public class GenericsExample1 {
    public static <T> int size(ArrayList<T> arr) {
        return arr.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 8));
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("London", "Paris", "Oslo", "Madrid"));
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'C', 'S', 'D'));

        System.out.println(size(nums));
        System.out.println(size(cities));
        System.out.println(size(chars));
    }
}
