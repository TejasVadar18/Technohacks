import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> todoList;

    public ToDoList() {
        todoList = new ArrayList<>();
    }

    public void addItem(String item) {
        todoList.add(item);
        System.out.println("Item added to the to-do list.");
    }

    public void removeItem(int index) {
        if (index >= 0 && index < todoList.size()) {
            todoList.remove(index);
            System.out.println("Item removed from the to-do list.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    public void displayItems() {
        if (todoList.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String addItem = scanner.nextLine();
                    toDoList.addItem(addItem);
                    break;
                case 2:
                    System.out.print("Enter the index of the item to remove: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    toDoList.removeItem(removeIndex - 1);
                    break;
                case 3:
                    toDoList.displayItems();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }
}