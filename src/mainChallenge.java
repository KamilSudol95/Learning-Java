
public class mainChallenge {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));

    }

    public static boolean isPalindrome(int number) {

        int ogNumber = number;
        int reverseNumber = 0;

        if (number < 0) {
            number = -number;
            ogNumber = number;
        }

        while (number != 0) {

            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number /=10;
        }

        return reverseNumber == ogNumber;
    }
}
