public class mainChallenge {

    public static void main(String[] args) {

        double firstHeight = convertToCentimeters(5);
        System.out.println("The height is " + firstHeight);

        double secondHeight = convertToCentimeters(6, 7);
        System.out.println("The height is " + secondHeight);

    }

    public static double convertToCentimeters(int inches) {

        return 2.54 * inches;
    }

    public static double convertToCentimeters(int feet, int inches) {

        int feetToInches = feet * 12 + inches;

        return convertToCentimeters(feetToInches);
    }
}
