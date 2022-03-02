package calculatorinterface;

import java.util.Scanner;

public class RegularCalculator implements CalculatorInterface {

    public int subtract(int x, int y) {
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    @Override
    public int divide(int x, int y) {
        return x / y;
    }

    @Override
    public double sqrt(int x) {
        System.out.println("Nie dziala");
        return 0;
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }
}