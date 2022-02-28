/*
Wprowadź pierwszą liczbę
Wybierz działanie:
        "+"
        "-"
        "*"
        "/"
Wprowadź drugą liczbę
Znaki działań w jednej linii oraz przed wynikiem "Exit"
*/

package calculators;

import java.util.Scanner;

public class Calculator6 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadź pierwszą liczbę: ");
            int x = scanner.nextInt();

            System.out.println("Jakie działanie chcesz wykonać?\n" +
                    "+ " +
                    "- " +
                    "* " +
                    "/ " +
                    "exit ");

            String choice = scanner.next();

            if (choice.equals("exit")) {
                exit();
            }

            System.out.println("Wprowadź drugą liczbę: ");
            int y = scanner.nextInt();

            switch (choice) {
                case "+" -> {
                    int result = add(x, y);
                    System.out.println("Wynik: " + result);
                }
                case "-" -> {
                    int result1 = subtract(x, y);
                    System.out.println("Wynik: " + result1);
                }
                case "*" -> {
                    int result2 = multiplication(x, y);
                    System.out.println("Wynik: " + result2);
                }
                case "/" -> {
                    int result3 = division(x, y);
                    System.out.println("Wynik: " + result3);
                }
                case "exit" -> exit();
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