package UsingArrays.ArrayChallenge;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static void main() {

        createRandomArray(10);
        createRandomArray(20);
    }

    private static int[] createRandomArray(int len) {

        Random random = new Random();
        int[] challengeArray = new int[len];

        for(int i = 0; i < challengeArray.length; i++){
                challengeArray[i] = random.nextInt(100);
        }

        System.out.println("Original Array: " + Arrays.toString(challengeArray));

        Arrays.sort(challengeArray);

        System.out.println("Sorted Array: " + Arrays.toString(challengeArray));
        int[] copiedChallengeArray = challengeArray.clone();

        for (int i = 0; i < copiedChallengeArray.length; i++) {

            copiedChallengeArray[i] = challengeArray[challengeArray.length - 1 - i];
        }

        System.out.println("Reversed Array: " + Arrays.toString(copiedChallengeArray));

        return copiedChallengeArray;

    }
}
