public class Factorial {
    public static int findFactorial(int a) {
        int total = 1;
        for (int i = 1; i <= a; i++) {
            total *= i;
        }
        return total;
    }
}
