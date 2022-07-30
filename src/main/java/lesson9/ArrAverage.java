package lesson9;

public class ArrAverage {
    public static double average(int[] arr) {
        int sum = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length * 1.0;
        return avg;
    }

    public static void main(String[] args) {
        ArrAverage obj = new ArrAverage();
        int[] arr = {2, 4, 6, 8};
        System.out.println(average(arr));


    }
}

