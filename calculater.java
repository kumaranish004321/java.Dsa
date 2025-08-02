import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        // Menu for operations
        System.out.println("Choose an operation:");
        System.out.println("1: Addition ");
        System.out.println("2: Subtraction ");
        System.out.println("3: Multiplication ");
        System.out.println("4: Division ");
        System.out.println("5: Modulo ");

        System.out.print("Enter your choice (1 to 5): ");
        int choice = scanner.nextInt();

        // Perform the operation
        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select between 1 and 5.");
        }

        scanner.close();
    }
}

