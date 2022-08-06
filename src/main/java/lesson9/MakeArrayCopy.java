package lesson9;

import java.util.Arrays;

public class MakeArrayCopy {
    public static String ArrayCopy(int[] arr) {
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];

        }
        return Arrays.toString(new_arr);
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 8, 23, 5, 100};
        System.out.println("New array: " + ArrayCopy(arr));


    }
}
