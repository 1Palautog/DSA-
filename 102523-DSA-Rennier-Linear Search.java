import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearchMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();

        while (true) {
            System.out.println("...................................................." );
             System.out.println("\t\tLINEAR SEARCH:");
             System.out.println("...................................................." );
            System.out.println("1. Add elements");
            System.out.println("2. Search for a value");
            System.out.println("3. Add a new set of elements");
            System.out.println("4. Delete elements");
            System.out.println("5. View list");
            System.out.println("6. Exit");
            System.out.println("...................................................." );
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addElements(scanner, array);
                    break;
                case 2:
                    searchValue(scanner, array);
                    break;
                case 3:
                    array.clear();
                    addListOfElements(scanner, array);
                    break;
                case 4:
                    deleteElements(scanner, array);
                    break;
                case 5:
                    viewList(array);
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void addElements(Scanner scanner, ArrayList<Integer> array) {
        System.out.println("Enter the elements of the array (type 'quit' to stop):");
        while (true) {
            if (scanner.hasNextInt()) {
                int element = scanner.nextInt();
                array.add(element);
            } else {
                String input = scanner.next();
                if (input.equals("quit")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'quit'.");
                }
            }
        }
    }

    public static void addListOfElements(Scanner scanner, ArrayList<Integer> array) {
        System.out.println("Enter a list of elements separated by spaces:");
        scanner.nextLine(); // Consume the newline character
        String elementsInput = scanner.nextLine();
        String[] elements = elementsInput.split(" ");
        for (String element : elements) {
            try {
                int value = Integer.parseInt(element);
                array.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers separated by spaces.");
                break;
            }
        }
    }

    public static void searchValue(Scanner scanner, ArrayList<Integer> array) {
        System.out.println("Current list of elements: " + array);
        System.out.print("Enter the value to search for: ");
        int searchValue = scanner.nextInt();
        int index = linearSearch(array, searchValue);

        if (index != -1) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found in the array.");
        }
    }

    public static void deleteElements(Scanner scanner, ArrayList<Integer> array) {
        System.out.println("Current list of elements: " + array);
        System.out.println("Enter the elements to delete (type 'quit' to stop):");
        while (true) {
            if (scanner.hasNextInt()) {
                int element = scanner.nextInt();
                if (array.contains(element)) {
                    array.remove(Integer.valueOf(element));
                    System.out.println("Element " + element + " removed.");
                } else {
                    System.out.println("Element " + element + " not found in the array.");
                }
            } else {
                String input = scanner.next();
                if (input.equals("quit")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'quit'.");
                }
            }
        }
    }

    public static void viewList(ArrayList<Integer> array) {
        System.out.println("Current list of elements: " + array);
    }

    public static int linearSearch(ArrayList<Integer> array, int target) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
