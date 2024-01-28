package org.example;

import org.example.Calculator;

import java.util.Scanner;

public class Menu {
    private Calculator calculator;

    public Menu() {
        this.calculator = new Calculator();
    }

    public void entrance() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        double[] numbers;

        printMenu();

        try {
            choice = scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }

        if (choice >= 1 && choice <= 7) {
            if (choice >= 5 && choice <= 7) {
                System.out.print("Enter the number: ");
                double num = getValidDoubleInput(scanner);

                double result;
                switch (choice) {
                    case 5:
                        result = calculator.squareRoot(num);
                        break;
                    case 6:
                        result = calculator.cosine(num);
                        break;
                    case 7:
                        result = calculator.sine(num);
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        return;
                }

                System.out.println("Result: " + result);

            } else {
                System.out.print("Enter the first number: ");
                double num1 = getValidDoubleInput(scanner);

                System.out.print("Enter the second number: ");
                double num2 = getValidDoubleInput(scanner);

                double result;
                switch (choice) {
                    case 1:
                        result = calculator.add(num1, num2);
                        break;
                    case 2:
                        result = calculator.subtraction(num1, num2);
                        break;
                    case 3:
                        result = calculator.multiplication(num1, num2);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = calculator.division(num1, num2);
                        } else {
                            System.out.println("Error: Division by zero is prohibited!");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        return;
                }

                System.out.println("Result: " + result);
            }
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    private void printMenu() {
        CalculatorLogo();
        System.out.println("------- Arithmetic Operations -------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("------- Advanced Operations -------");
        System.out.println("5. Square Root");
        System.out.println("6. Cosine");
        System.out.println("7. Sine");
        System.out.print("Enter your choice: ");
    }

    private void CalculatorLogo() {
        System.out.println("  _______  __     __  _______    ______    _______  __   __ ");
        System.out.println(" |       ||  |   |  ||       |  |    _ |  |       ||  | |  |");
        System.out.println(" |   _   ||  |   |  ||   _   |  |   | ||  |   _   ||  | |  |");
        System.out.println(" |  | |  ||  |   |  ||  | |  |  |   |_||_ |  | |  ||  |_|  |");
        System.out.println(" |  |_|  ||  |   |  ||  |_|  |  |    __  ||  |_|  ||       |");
        System.out.println(" |       ||  |   |  ||       |  |   |  | ||       ||       |");
        System.out.println(" |_______||__|   |__||_______|  |___|  |_||_______||_______|");
    }

    private double getValidDoubleInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception ex) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }
}