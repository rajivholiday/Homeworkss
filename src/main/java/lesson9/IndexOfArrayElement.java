package lesson9;

public class IndexOfArrayElement {
    public static int find(int[] a, int target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target) {
                return i;
            }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {20, 15, 3, 32};
        System.out.println(find(a, 32));
        System.out.println(find(a, 99));
    }
}
