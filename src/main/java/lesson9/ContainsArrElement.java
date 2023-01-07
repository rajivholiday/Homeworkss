package lesson9;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsArrElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(containsElement(arr, 4));
        System.out.println(containsElement(arr, 10));
    }

    public static boolean containsElement(int[] arr, int target) {
        for (int i : arr) {
            if (target == i) {
                return true;
            }
        }
        return false;
    }
}
