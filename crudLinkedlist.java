
import java. util.*;
public class UserInputLinkedList {
	public static void x(String var) {
		System. out.println(var);
	}
	public static void x(int  var) {
		System. out.println(var);
	}

	public static void main(String[] args) {

		LinkedList<String> linkList = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			x("\nMenu\n 1. Create\n 2. Delete\n 3. Read\n 4. Update");
			System. out.print("\n:");
			String op = scanner.nextLine();

			if (op.equals("1")) {
				while (true){
				System.out.print("Enter a value [Enter 'quit' to exit] ");
				String input = scanner.nextLine();

				if (input.equalsIgnoreCase("quit")) {
					break;
				}
				linkList.add(input);
		
			}
					x("Added");
			}

			if (op.equals("3")) {
						if (linkList.isEmpty()){
				    x("LinkedList is empty");
				}else{
				System.out.println("Linked list contents: ");
				for (String item : linkList) {
					System.out.println(item);
				}
			
			System.out.println("Size of list: " + linkList.size());
		//	System.out.println("List status: " + linkList.isEmpty());
				}
			}
			if (op.equals("2")) {
				if (linkList.isEmpty()){
				    x("LinkedList is empty");
				}else{
				
			x("Enter content to Delete:");
			String del=scanner. nextLine ();
				linkList.remove(del);
				x("deleted");
				}
			}
					if (op.equals("4")) {
				if (linkList.isEmpty()){
				    x("LinkedList is empty");
				}else{
				
			x("Enter content to Update:");
			String up=scanner. nextLine ();
			
				linkList.remove(up);
							
			x("Enter new content to Update:");
			String up2=scanner. nextLine ();
				linkList. add(up2);
				x("updated!");
			}
				}


				//System.out.println("Linked list contents: " + (linkList));
		}

	}
}


