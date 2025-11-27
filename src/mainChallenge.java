
public class mainChallenge {
    public static void main(String[] args) {

        int number = 4;
        int evenCounter = 0;
        int oddCounter = 0;

        while (number <= 20){
            number++;

            if(!isEvenNumber(number)){
                oddCounter++;
                System.out.println(number + " is odd number");
                continue;
            }
            System.out.println(number + " is even number");
            evenCounter++;
            if(evenCounter == 5){
                break;
            }
        }
        System.out.println("There are " + evenCounter + " even numbers and " + oddCounter + " odd numbers");
    }
    public static boolean isEvenNumber(int number){

        return number % 2 == 0;
    }
}
