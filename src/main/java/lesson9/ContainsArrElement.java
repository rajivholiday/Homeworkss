package lesson9;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsArrElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(containsElement(arr, 4));
        System.out.println(containsElement(arr, 10));
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Tom", "Kate", "Max", "Miguel", "Frank"));
        System.out.println(names.indexOf("Tom"));
        names.hashCode();


    }

    public static boolean containsElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
