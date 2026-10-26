package ArrayChallenge;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static void main() {

        int[] intArray = readIntegers();
        System.out.println(Arrays.toString(intArray));

        System.out.println(findMin(intArray));

    }

    public static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter comma separated numbers: ");
        String input = scanner.nextLine();
        String[] splits = input.split(",");

        int[] intArray = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            intArray[i] = Integer.parseInt(splits[i].trim());
        }

        return intArray;
    }

    public static int findMin(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
