import java.util.Scanner;

public class TestInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = input("Enter a string");
        System.out.println("Input: " + input);
    }

    public static String input(String info) {
        System.out.print(info + ": ");
        String data = scanner.nextLine();
        return data;
    }
}