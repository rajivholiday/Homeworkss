package lesson9;

import java.util.Arrays;

public class RemoveArrayElement {
    public static String removeElement(int[] arr, int target) {
        int[] new_arr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                new_arr[j++] = arr[i];

            }
        }
        return Arrays.toString(new_arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target1 = 5; // int target1 = 15; olduqda exception verir
        System.out.println(removeElement(arr, target1));

    }
}