package calculatorinterface;

import java.util.Scanner;

public class ScientificCalculator implements CalculatorInterface {

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
        return Math.sqrt(x);
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }
}
