public class Palindrome {
    public static boolean checkIfPalindrome(String s1) {
        String s2 = new StringBuffer(s1).reverse().toString();
        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }
}
