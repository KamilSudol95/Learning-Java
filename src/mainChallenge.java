import java.util.Scanner;

void main() {

    int counter = 1;
    int sum = 0;

    Scanner scanner = new Scanner(System.in);

    while (counter <= 5){

        System.out.println("Please enter number #" + counter);

        try {

            int currentNum = Integer.parseInt(scanner.nextLine());
            counter++;
            sum += currentNum;

        } catch (NumberFormatException e) {

            System.out.println("Invalid input, please try again.");
        }
    }
        System.out.println("The sum of the numbers is: " + sum);
        scanner.close();

}

