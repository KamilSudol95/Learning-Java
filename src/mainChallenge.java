
public class mainChallenge {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;

        if(num1 < 10 || num2 < 10 || num3 < 10 || num1 > 1000 || num2 > 1000 || num3 > 1000){
            return false;
        }

        return lastDigit1 == lastDigit2 || lastDigit2 == lastDigit3 || lastDigit1 == lastDigit3;
    }

    public static boolean isValid(int number){

        if (number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
