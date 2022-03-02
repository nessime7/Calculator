package calculatorinterface;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Wybierz kalkulator");
        System.out.println("1 - Normalny");
        System.out.println("2 - Naukowy");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 1) {
            CalculatorInterface calc1 = new RegularCalculator();
        } else if (input == 2) {
            CalculatorInterface calc2 = new ScientificCalculator();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
