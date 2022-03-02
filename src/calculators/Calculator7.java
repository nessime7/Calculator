/*
Wprowadź pierwszą liczbę
Wybierz działanie:
"+"
"-"
"*"
"/"
Wprowadź drugą liczbę
Jak program się odpali to dwie opcje: 1. calc 2. exit; po wciśnięciu 1. odpala się kalkulator.
Jak się kończy działanie to znowu dwie opcje.
 */

package calculators;

import java.util.Scanner;

public class Calculator7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Calculator\n" +
                    "2. Exit\n");
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    System.out.println("Wprowadź pierwszą liczbę: ");
                    int x = scanner.nextInt();

                    System.out.println("Wyniki z działań: \n" +
                            "+\n" +
                            "-\n" +
                            "*\n" +
                            "/\n");

                    String choice1 = scanner.next();

                    System.out.println("Wprowadź drugą liczbę: ");
                    int y = scanner.nextInt();

                    switch (choice1) {
                        case "+":
                            int result = add(x, y);
                            System.out.println("Wynik: " + result);
                            break;

                        case "-":
                            int result1 = substract(x, y);
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
                    break;
                case "2":
                    exit();
                    break;
            }
        }
    }

    private static void exit() {
        System.exit(0);
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int substract(int x, int y) {
        return x - y;
    }

    static int multiplication(int x, int y) {
        return x * y;
    }

    static int division(int x, int y) {
        return x / y;
    }
}