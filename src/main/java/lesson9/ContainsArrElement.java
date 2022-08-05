package lesson9;

public class ContainsArrElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(containsElement(arr, 10));
    }

    public static boolean containsElement(int[] arr, int target) {
        boolean contains = true;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return contains;
            }
        }
        return false;
    }
}
