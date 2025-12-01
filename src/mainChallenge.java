
public class mainChallenge {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit (int number1, int number2){

        int comparisionDigit;

        if (number1 < 10 || number2 < 10 || number1 > 99 || number2 > 99){
            return false;
        }

        while(number1 >0){
            int digit1 = number1 % 10;
            comparisionDigit = number2;

            while(comparisionDigit > 0){
                int digit2 = comparisionDigit % 10;
                if(digit1 == digit2){
                    return true;
                }
                comparisionDigit /= 10;
            }
            number1 /= 10;
        }
        return false;
    }
}
