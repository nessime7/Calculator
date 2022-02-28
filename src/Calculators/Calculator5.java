/*
Wprowadź pierwszą liczbę
Wybierz działanie:
"+"
"-"
"*"
"/"
Wprowadź drugą liczbę
Mogę wykonywać wiele kalulacji, czyli zapętlenie aż do momentu wciśnięcia exit przez użytkownika.
 */

package Calculators;

import java.util.Scanner;

public class Calculator5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wprowadż pierwszą liczbę: ");
            int x = scanner.nextInt();

            System.out.println("Jakie działanie chcesz wykonać?\n" +
                    "+\n" +
                    "-\n" +
                    "*\n" +
                    "/\n");

            String choice = scanner.next();

            System.out.println("Wprowadź drugą liczbę: ");
            int y = scanner.nextInt();

            switch (choice) {
                case "+":
                    int result = add(x, y);
                    System.out.println(result);
                    break;

                case "-":
                    int result1 = subtract(x, y);
                    System.out.println(result1);
                    break;

                case "*":
                    int result2 = multiplication(x, y);
                    System.out.println(result2);
                    break;

                case "/":
                    int result3 = division(x, y);
                    System.out.println(result3);
                    break;
            }
        }

    }

    private static void exit() {
        System.exit(1);
    }

    private static int division(int x, int y) {
        return x / y;
    }

    private static int multiplication(int x, int y) {
        return x * y;
    }

    private static int subtract(int x, int y) {
        return x - y;
    }

    private static int add(int x, int y) {
        return x + y;
    }
}