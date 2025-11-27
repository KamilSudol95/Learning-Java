
public class mainChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(1357));
        System.out.println(sumDigits(9999));
        System.out.println(sumDigits(0000));
        System.out.println(sumDigits(1234567));
        System.out.println(sumDigits(9908700));

    }

    public static int sumDigits(int number) {

        int sum = 0;
        int divisor = 10;

        if (number < 0) {
            return -1;
        }

        while (number > 9) {
            sum += number % divisor;
            number /= divisor;
        }
        sum += number;
        return sum;
    }
}
