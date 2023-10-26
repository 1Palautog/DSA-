
import java.util.*;

public class HashtableMenu {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("...................................................." );
             System.out.println("\t\tHASH TABLE");
             System.out.println("...................................................." );
            System.out.println("1. Add Key-Value Pair");
            System.out.println("2. Retrieve Value by Key");
            System.out.println("3. Remove Key-Value Pair");
            System.out.println("4. Display Hashtable");
            System.out.println("5. Exit");
            System.out.println("...................................................." );
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
          
                    System.out.print("Enter key (integer): ");
                    int key = scanner.nextInt();
             
                    System.out.print("Enter value: ");
                    scanner.nextLine(); 
                    String value = scanner.nextLine();
                    hashtable.put(key, value);
                    System.out.println("Key-Value pair added.");
                    
                    break;

                case 2:
                    System.out.print("Enter key to retrieve value: ");
                    int retrieveKey = scanner.nextInt();
                    String retrievedValue = hashtable.get(retrieveKey);
                    if (retrievedValue != null) {
                        System.out.println("Value for key " + retrieveKey + ": " + retrievedValue);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter key to remove: ");
                    int removeKey = scanner.nextInt();
                    String removedValue = hashtable.remove(removeKey);
                    if (removedValue != null) {
                        System.out.println("Key-Value pair removed: Key = " + removeKey + ", Value = " + removedValue);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 4:
    if (hashtable.isEmpty()) {
        System.out.println("Hashtable is empty.");
    } else {
        System.out.println("Hashtable Content:");
        for (Integer k : hashtable.keySet()) { 
            System.out.println("Key: " + k + ", Value: " + hashtable.get(k));
        }
    }
    break;


                case 5:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
