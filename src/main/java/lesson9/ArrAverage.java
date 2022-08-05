package lesson9;

public class ArrAverage {
    public static double average(int[] arr) {
        int sum = 0;
        double avg;
        for (int i : arr) {
            sum += i;
        }
        avg = (double) sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        System.out.println(average(arr));


    }
}

