import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter range");
        int range = scanner.nextInt();
    }

    public static int[] createArray(int range) {
        Random random = new Random();
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        range = random.nextInt(100);
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }


        return new int[]{};
    }

    public static int[] sortEvens(int[] arr) {
        return new int[]{};
    }

}