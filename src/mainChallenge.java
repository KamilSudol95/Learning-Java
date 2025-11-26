
public class mainChallenge {

    public static void main(String[] args) {

        int divisableCounter = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++){
            if(dividableNumber(i)){
                divisableCounter++;
                sum += i;
                System.out.println(i);
            }
            if(divisableCounter == 5){
                System.out.println("Threshold of 5 dividable numbers reached.");
                break;
            }
        }
        System.out.println("Sum of all dividable numbers: " + sum);
    }

    public static boolean dividableNumber(int number){

        return number % 3 == 0 && number % 5 == 0;
    }

}
