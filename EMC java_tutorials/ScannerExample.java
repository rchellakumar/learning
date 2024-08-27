import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // Display the user's input
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner
        scanner.close();
    }
}
