package ArrayListChallenge;

import java.util.*;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();
        boolean toContinue = true;

        while (toContinue) {

            printMessage();
            int action = scanner.nextInt();

            if (action == 0) {
                toContinue = false;
                System.out.println("Goodbye!");
            }

            else if (action == 1) {
                System.out.println("Enter the items you want to add (comma delimited list):");
                String items = scanner.nextLine();
                String trimmedItems = items.trim();
                String[] itemsArray = trimmedItems.split(",");
                for (String item : itemsArray) {
                    if (groceryList.contains(item)) {
                        System.out.println("Item already exists in the list.");
                    } else {
                        groceryList.add(item);
                    }
                }
                Collections.sort(groceryList);
                System.out.println("Grocery list: " + groceryList);
            }

            else if (action == 2) {

                System.out.println("Enter the items you want to remove (comma delimited list):");
                String items = scanner.next();
                String[] itemsArray = items.split(",");
                groceryList.removeAll(Arrays.asList(itemsArray));

                Collections.sort(groceryList);
                System.out.println("Grocery list: " + groceryList);
            }
            else {
                System.out.println("Invalid action!");
                printMessage();
            }
        }
    }

    static void printMessage() {

        System.out.println("Available actions:");
        System.out.println();
        System.out.println("0 - to shutdown");
        System.out.println();
        System.out.println("1 - to add an item(s) to list (comma delimited list");
        System.out.println();
        System.out.println("2 - to remove any items (comma delimited list)");
        System.out.println();
        System.out.println("Enter a number for which action you want to do:");
        System.out.println();

    }
}
