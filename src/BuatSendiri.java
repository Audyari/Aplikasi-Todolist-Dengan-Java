import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuatSendiri {
    private static final int INITIAL_MAX_TODO_ITEMS = 3; // Kapasitas awal
    private static int maxTodoItems = INITIAL_MAX_TODO_ITEMS;
    private static List<String> todos = new ArrayList<>(maxTodoItems);

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = getMenuChoice(scanner);

            processMenuChoice(choice, scanner);
        } while (choice != 4);

        System.out.println("Exiting...");
    }

    private static void printMenu() {
        System.out.println("TODO List Menu:");
        System.out.println("1. Display Todo List");
        System.out.println("2. Add Todo");
        System.out.println("3. Remove Todo");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
    }

    private static int getMenuChoice(Scanner scanner) {
        int choice = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline character
        return choice;
    }

    private static void processMenuChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                displayTodoList();
                break;
            case 2:
                promptAddTodo(scanner);
                break;
            case 3:
                promptRemoveTodo(scanner);
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
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

    private static void promptAddTodo(Scanner scanner) {
        System.out.print("Enter a new todo: ");
        String newTodo = scanner.nextLine();

        if (todos.size() < maxTodoItems) {
            todos.add(newTodo);
            System.out.println("Todo added successfully.");
        } else {
            expandTodoList(newTodo);
            System.out.println("Todo added successfully. Array size increased.");
        }
        System.out.println();
    }

    private static void expandTodoList(String newTodo) {
        maxTodoItems *= 2; // Memperbesar menjadi dua kali lipat
        List<String> previousTodos = new ArrayList<>(todos);
        todos = new ArrayList<>(maxTodoItems);
        todos.addAll(previousTodos); // Menyalin data sebelumnya
        todos.add(newTodo); // Menambahkan todo baru
    }

    private static void promptRemoveTodo(Scanner scanner) {
        displayTodoList();

        System.out.print("Enter the number of the todo to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline character

        if (isValidTodoIndex(index)) {
            String removedTodo = todos.remove(index - 1);
            System.out.println("Removed todo: " + removedTodo);
        } else {
            System.out.println("Invalid todo number. Please try again.");
        }
        System.out.println();
    }

    private static boolean isValidTodoIndex(int index) {
        return index >= 1 && index <= todos.size();
    }
}