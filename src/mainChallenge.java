
public class mainChallenge {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(5, 3, 24));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int maxBigBag = goal / 5;
        int bigUsed;
        int remainder;

        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        if (bigCount > maxBigBag){
            bigUsed = maxBigBag;
        }
        else {
            bigUsed = bigCount;
        }

        remainder = goal - bigUsed * 5;

        return smallCount >= remainder;
    }
}
