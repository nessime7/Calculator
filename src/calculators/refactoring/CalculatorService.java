package calculators.refactoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorService {

    private final List<Calculation> calculations = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private final OperationService operationService = new OperationService();

    public void run() {
        while (true) {
            System.out.println("1. Calculator\n" +
                    "2. Exit\n" +
                    "3. Print\n");
            int userChoice = scanner.nextInt();
            consoleSwitch(userChoice);
        }
    }

    private void consoleSwitch(int choice) {
        switch (choice) {
            case 1:
                doCalculation();
                break;
            case 2:
                exit();
                break;

            case 3:
                for (Calculation element : calculations) {
                    System.out.println(element);
                }
                break;
        }
    }

    private void doCalculation() {
        System.out.println("Wprowadź pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Wybierz operację: \n" +
                "+\n" +
                "-\n" +
                "*\n" +
                "/\n");

        String operation = scanner.nextLine();
        System.out.println("Wprowadź drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        int result = calculate(firstNumber, operation, secondNumber);
        calculations.add(new Calculation(firstNumber, operation, secondNumber, result));
    }

    private int calculate(int firstNumber, String operation, int secondNumber) {
        int result = 0;
        switch (operation) {
            case "+":
                result = operationService.add(firstNumber, secondNumber);
                break;

            case "-":
                result = operationService.substract(firstNumber, secondNumber);
                break;

            case "*":
                result = operationService.multiply(firstNumber, secondNumber);
                break;

            case "/":
                result = operationService.divide(firstNumber, secondNumber);
                break;
        }
        System.out.println("Wynik: " + result);
        return result;
    }

    private static void exit() {
        System.exit(0);
    }
}
