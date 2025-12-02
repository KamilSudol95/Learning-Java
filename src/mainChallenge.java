
public class mainChallenge {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        //numberToWords(123);
        //numberToWords(1010);
        //numberToWords(1000);
        //numberToWords(-12);
        //numberToWords(0);
        //numberToWords(1450);



    }

    public static void numberToWords (int number){


        int reversed = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversed);
        int missingZeroes = originalDigitCount - reversedDigitCount;

        if (number < 0){
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        while (reversed > 0){
            int digit = reversed % 10;

            switch (digit){
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }

            reversed /= 10;

        }
        for (int i = 0; i < missingZeroes; i++){
            System.out.println("Zero");
        }

    }

    public static int reverse (int number){

        boolean isNegative = false;
        int reversedNumber = 0;

        if (number < 0) {
            isNegative = true;
            number *= -1;
        }

        while (number > 0){
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        if (isNegative) reversedNumber *= -1;

        return reversedNumber;
    }

    public static int getDigitCount (int number){

        int counter = 0;

        if (number < 0){
            return -1;
        }
        else if (number == 0){
            return 1;
        }

        while (number > 0){
            counter++;
            number /= 10;
        }
        return counter;
    }
}
