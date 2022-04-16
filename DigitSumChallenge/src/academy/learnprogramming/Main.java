package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(12));
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(1111111111));
        System.out.println(sumDigits(-1234));
        System.out.println(NumberPalindrome.isPalindrome(222));
        System.out.println(NumberPalindrome.isPalindrome(-222));
    }

    private static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            int digit = number%10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }

}
