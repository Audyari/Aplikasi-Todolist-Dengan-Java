import java.util.ArrayList;
import java.util.Scanner;

public class BuatSendiri {
    private static final int MAX_TODO_ITEMS = 10; // Menggunakan konstanta untuk kapasitas maksimum
    private static ArrayList<String> todos = new ArrayList<>(); // Menggunakan ArrayList untuk fleksibilitas

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("TODO List Menu:");
            System.out.println("1. Display Todo List");
            System.out.println("2. Add Todo");
            System.out.println("3. Remove Todo");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline character

            switch (choice) {
                case 1:
                    displayTodoList();
                    break;
                case 2:
                    promptAddTodo();
                    break;
                case 3:
                    promptRemoveTodo();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void displayTodoList() {
        System.out.println("Todo List:");
        if (todos.isEmpty()) {
            System.out.println("No todos found.");
        } else {
            for (int i = 0; i < todos.size(); i++) {
                System.out.println((i + 1) + ". " + todos.get(i));
            }
        }
        System.out.println();
    }

    private static void promptAddTodo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new todo: ");
        String newTodo = scanner.nextLine();

        if (todos.size() < MAX_TODO_ITEMS) {
            todos.add(newTodo);
            System.out.println("Todo added successfully.");
        } else {
            System.out.println("Maximum todo items reached. Unable to add new todo.");
        }
        System.out.println();
    }

    private static void promptRemoveTodo() {
        Scanner scanner = new Scanner(System.in);
        displayTodoList();

        System.out.print("Enter the number of the todo to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline character

        if (index >= 1 && index <= todos.size()) {
            String removedTodo = todos.remove(index - 1);
            System.out.println("Removed todo: " + removedTodo);
        } else {
            System.out.println("Invalid todo number. Please try again.");
        }
        System.out.println();
    }
}