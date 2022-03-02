/*
Wprowadź pierwszą liczbę
Wybierz działanie:
"+"
"-"
"*"
"/"
Wprowadź drugą liczbę
Wyekstraktuj metody.
Logika która jest w switchu, zrobić ją w metodzie aby poukładać kod.
 */

package calculators;

import java.util.Scanner;

public class Calculator8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Calc\n" +
                    "2. Exit\n");
            String choice1 = scanner.next();
            switch (choice1) {
                case "1":
                    calculate(scanner);
                    break;
                case "2":
                    exit();
                    break;
            }
        }
    }

    private static void calculate(Scanner scanner) {
        System.out.println("Wprowadź pierwszą liczbę: ");
        int x = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę: ");
        int y = scanner.nextInt();

        System.out.println("Działania: \n" +
                "+ " +
                "- " +
                "* " +
                "/ " +
                "exit ");

        String choice = scanner.next();

        switch (choice) {
            case "+":
                int result = add(x, y);
                System.out.println("Wynik: " + result);
                break;

            case "-":
                int result1 = subtract(x, y);
                System.out.println("Wynik: " + result1);
                break;

            case "*":
                int result2 = multiplication(x, y);
                System.out.println("Wynik: " + result2);
                break;

            case "/":
                int result3 = division(x, y);
                System.out.println("Wynik: " + result3);
                break;
        }
    }


    private static void exit() {
        System.exit(0);
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