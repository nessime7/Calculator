package calculatorinterface;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Wybierz kalkulator");
        System.out.println("1 - Normalny");
        System.out.println("2 - Naukowy");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        CalculatorService calc;
        if (input == 1) {
            calc = new CalculatorService(new RegularCalculator());
        } else if (input == 2) {
            calc = new CalculatorService(new ScientificCalculator());
        } else {
            throw new IllegalArgumentException();
        }
        System.out.println("Wybrales kalkulator " + (input == 1 ? "normalny" : "naukowy"));
        calc.run();
    }
}
