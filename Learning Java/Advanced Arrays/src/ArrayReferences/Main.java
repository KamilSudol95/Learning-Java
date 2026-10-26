package ArrayReferences;

import java.util.Arrays;

public class Main {
    static void main() {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray[0] = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray[0] = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }
}
