package calculatorinterface;

import java.util.Scanner;

public class CalculatorService {

    private Scanner scanner;
    private final CalculatorInterface calculator;

    public CalculatorService(CalculatorInterface calculator) {
        this.calculator = calculator;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("1. Calc\n" +
                    "2. Exit\n");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    calculate(scanner);
                    break;
                case "2":
                    exit();
                    break;
                default:
                    System.out.println("Nieprawidlowy wybor");
            }
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private void calculate(Scanner scanner) {
        System.out.println("Wprowadź pierwszą liczbę: ");
        int x = scanner.nextInt();


        System.out.println("Działania: \n" +
                "+\n" +
                "-\n" +
                "*\n" +
                "/\n" +
                "sqrt\n" +
                "exit\n");

        String choice = scanner.next();

        int y = 0;
        if (!(choice.equals("sqrt"))) {
            System.out.println("Wprowadź drugą liczbę: ");
            y = scanner.nextInt();
        }

        switch (choice) {
            case "+":
                int result = calculator.add(x, y);
                System.out.println("Wynik: " + result);
                break;

            case "-":
                int result1 = calculator.subtract(x, y);
                System.out.println("Wynik: " + result1);
                break;

            case "*":
                int result2 = calculator.multiply(x, y);
                System.out.println("Wynik: " + result2);
                break;

            case "/":
                int result3 = calculator.divide(x, y);
                System.out.println("Wynik: " + result3);
                break;

            case "sqrt":
                double result4 = calculator.sqrt(x);
                System.out.println("Wynik: " + result4);
                break;
        }
    }
}
