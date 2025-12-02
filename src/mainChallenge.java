
public class mainChallenge {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(1));
    }

    public static int getLargestPrime(int number){

        int largestPrime = 1;
        boolean isPrime = true;

        if(number <= 1) return -1;

        for (int i = 2; i <= number; i++){
            if(number % i == 0){

                for (int j = 2; j < i; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime){
                    largestPrime = i;
                }
            }
        }

        return largestPrime;

    }
}
