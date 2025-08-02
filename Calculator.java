import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input two numbers
        System.out.println("Enter First Number (a): ");
        double a = scanner.nextDouble();

        System.out.println("Enter Second Number (b): ");
        double b = scanner.nextDouble();

       //operations
       System.out.println("choose an operations:");
       System.out.println("1: Addition ");
       System.out.println("2: Subtraction ");
       System.out.println("3: Multiplication ");
       System.out.println("4: Division ");
       System.out.println("5: Modulo ");

       System.out.println("Enter your choise (1 to 5): ");
       int choice = scanner.nextInt();

    //perform the operation
    switch (choice) {
        case 1:
            System.out.println("Result:" + (a + b));
            break;
         case 2:
             System.out.println("Result:" + (a - b));
             break;
         case 3:
             System.out.println("Result:" + (a * b));
             break;
        case 4:
        if (b != 0) {
             System.out.println("Result:" + (a / b));
        }else{
            System.out.println("Error: Division by zero is not allowed");
        }
             break;
        case 5:
        if (b != 0) {
                System.out.println("Result:" + (a % b));
        }else{
            System.out.println("Error: modulo by zero is not allowed");
        }
            break;
            default:
            System.out.println("Invalid choise.please select between 1 and 5. ");
                
            

 
        }

        scanner.close();
    }
}
