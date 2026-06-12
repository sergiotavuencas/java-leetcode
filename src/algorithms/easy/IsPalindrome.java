package algorithms.easy;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String reversed = new StringBuilder(number).reverse().toString();

        if (number.equals(reversed)) {
            return true;
        }

        return false;
    }
}