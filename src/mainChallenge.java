import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);

    double max = 0;
    double min = 0;
    int loopCounter = 0;

    while (true) {
        System.out.println("Enter a number, or any character to exit:");
        String nextEntry = scanner.nextLine();

        try{
            double validNum = Double.parseDouble(nextEntry);

            if (validNum > max || loopCounter == 0) {
                max = validNum;
            }
            if (validNum < min || loopCounter == 0) {
                min = validNum;
            }
            loopCounter++;
        } catch (NumberFormatException e) {
            break;
        }
    } if (loopCounter > 0) {
        System.out.println("Max: " + max + " Min: " + min);
    } else {
        System.out.println("No numbers entered.");
    }

}

