package ArraysProject;

import java.util.Arrays;

public class Main {

    static void main() {

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myIntArray[5]);

        int[] firstFivePositives = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(firstFivePositives));
        System.out.println(firstFivePositives[firstFivePositives.length - 1]);

        int[] newArray;
        newArray = new int[] {5, 4, 3, 2, 1};

        for (int i = 0; i < newArray.length; i++) {

            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        //Enhanced FOR LOOP
        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is an int array");
        }
    }
}
