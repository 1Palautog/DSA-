import java.util.*;

public class BinarySearch{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();

		while (true) {
			System.out.println("...................................................." );
             System.out.println("\t\tBINARY SEARCH:");
             System.out.println("...................................................." );
			System.out.println("1. Add elements (sorted order)");
			System.out.println("2. Search for a value");
			System.out.println("3. Add a new set of elements (sorted order)");
			System.out.println("4. Delete elements");
			System.out.println("5. View list");
			System.out.println("6. Exit");
            System.out.println("...................................................." );
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addElementsSorted(sc, array);
				break;
			case 2:
				searchValueBinary(sc, array);
				break;
			case 3:
				array.clear();
				addElementsSorted(sc, array);
				break;
			case 4:
				deleteElements(sc, array);
				break;
			case 5:
				viewList(array);
				break;
			case 6:
				sc.close();
				return;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}
	}

	public static void addElementsSorted(Scanner sc, ArrayList<Integer> array) {
		System.out.println("Enter the elements of the array (type 'quit' to stop):");
		while (true) {
			if (sc.hasNextInt()) {
				int element = sc.nextInt();
				array.add(element);
			} else {
				String input = sc.next();
				if (input.equals("quit")) {
					break;
				} else {
					System.out.println("Invalid input. Please enter an integer or 'quit'.");
				}
			}
		}

		Collections.sort(array);
	}


	public static void searchValueBinary(Scanner sc, ArrayList<Integer> array) {
		System.out.print("Enter the value to search for: ");
		int searchValue = sc.nextInt();
		int index = Collections.binarySearch(array, searchValue);

		if (index >= 0) {
			System.out.println("Value found at index: " + index);
		} else {
			System.out.println("Value not found in the array.");
		}
	}

	public static void deleteElements(Scanner sc, ArrayList<Integer> array) {
		System.out.println("Enter the elements to delete (type 'quit' to stop):");
		while (true) {
			if (sc.hasNextInt()) {
				int element = sc.nextInt();
				if (array.contains(element)) {
					array.remove(Integer.valueOf(element));
					System.out.println("Element " + element + " removed.");
				} else {
					System.out.println("Element " + element + " not found in the array.");
				}
			} else {
				String input = sc.next();
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
}
