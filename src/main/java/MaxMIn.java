import java.util.Arrays;

public class MaxMIn {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumMaxMin(new int[]{1, 2, 3, 5, 10})) + " expected [11, 20]");
        System.out.println(Arrays.toString(sumMaxMin(new int[]{0, 5, 1, 3, 2})) + " expected [6, 11]");
        System.out.println(Arrays.toString(sumMaxMin(new int[]{1, 3, 25, 21, 7})) + " expected [32, 56]");
    }

    public static int[] sumMaxMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i] != max) {
                minSum += arr[i];
            }
            if (arr[i] != min) {
                maxSum += arr[i];
            }
        }
        return new int[]{minSum, maxSum};
    }
}
