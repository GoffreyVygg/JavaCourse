package academy.learnprogramming;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int num = 0;
        if(number < 0) {
            num = -1 * number;
        } else {
            num = number;
        }
        int reverse = 0;
        while(num != 0) {
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        if(number < 0) {
            reverse *= -1;
        }
        return number == reverse;
    }

}