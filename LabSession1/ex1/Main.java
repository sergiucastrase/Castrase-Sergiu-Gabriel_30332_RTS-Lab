package LabSession1.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice; // Variable to store the user's menu choice

        // Loop to display the menu and perform operations until the user exits
        do {
            // Display the menu options
            System.out.println("Complex Number Operations");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");
            choice = scanner.nextInt(); // Read the user's choice

            // Check if exit
            if (choice == 4) break;

            // Request the first complex number
            System.out.print("Enter real part of the first number: ");
            double real1 = scanner.nextDouble();
            System.out.print("Enter imaginary part of the first number: ");
            double imaginary1 = scanner.nextDouble();
            ComplexNumber num1 = new ComplexNumber(real1, imaginary1); // Create the first complex number

            // Request the second complex number
            System.out.print("Enter real part of the second number: ");
            double real2 = scanner.nextDouble();
            System.out.print("Enter imaginary part of the second number: ");
            double imaginary2 = scanner.nextDouble();
            ComplexNumber num2 = new ComplexNumber(real2, imaginary2); // Create the second complex number

            ComplexNumber result = null; // result of the operation

            // Use a switch statement to perform the selected operation
            switch (choice) {
                case 1: // Addition
                    result = num1.add(num2);
                    break;
                case 2: // Subtraction
                    result = num1.subtract(num2);
                    break;
                case 3: // Multiplication
                    result = num1.multiply(num2);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            // Display the result if an operation was performed
            if (result != null) {
                System.out.println("Result: " + result);
            }
        } while (choice < 4); // Continue until the user chooses to exit

        scanner.close(); // Close the scanner to prevent resource leak
        System.out.println("Application exited."); // Indicate that the application has exited
    }
}
