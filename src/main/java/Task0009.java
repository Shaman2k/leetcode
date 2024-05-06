public class Task0009 {
    /*
    9. Palindrome Number
    https://leetcode.com/problems/palindrome-number/description/
     */

    public boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;
        if (x < 0) {
            return false;
        }
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev == x;
    }
}