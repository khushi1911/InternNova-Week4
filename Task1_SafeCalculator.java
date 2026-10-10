import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_SafeCalculator {

@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean running = true;

    while (running) {
        try {
            System.out.println("\n===== SAFE CALCULATOR =====");

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Result: " + (num1 + num2));

                case 2 -> System.out.println("Result: " + (num1 - num2));

                case 3 -> System.out.println("Result: " + (num1 * num2));

                case 4 -> {
                    if (num2 == 0) {
                        throw new ArithmeticException(
                                "Division by zero is not allowed."
                        );
                    }
                    System.out.println("Result: " + (num1 / num2));
                }

                case 5 -> {
                    if (num2 == 0) {
                        throw new ArithmeticException(
                                "Modulus by zero is not allowed."
                        );
                    }
                    System.out.println("Result: " + (num1 % num2));
                }

                case 6 -> {
                    System.out.println("Calculator closed successfully.");
                    running = false;
                }

                default -> System.out.println("Invalid choice! Enter a number from 1 to 6.");
            }

        } catch (InputMismatchException e) {
            System.out.println(
                "Error: Invalid input! Please enter numeric values only."
            );
            sc.nextLine();

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    sc.close();
}
}
