package calculators.refactoring;

public class Calculation {
    public final int firstNumber;
    public final String operation;
    public final int secondNumber;
    public final int result;

    public Calculation(int firstNumber, String operation, int secondNumber, int result) {
        this.firstNumber = firstNumber;
        this.operation = operation;
        this.secondNumber = secondNumber;
        this.result = result;
    }

    @Override
    public String toString() {
        return firstNumber + " " + operation + " " + secondNumber + " " + result;
    }
}
