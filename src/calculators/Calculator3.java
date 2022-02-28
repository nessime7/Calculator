/*
Wprowadź pierwszą liczbę
Wybierz działanie:
"+"
"-"
"*"
"/"
Wprowadź drugą liczbę
Każde działanie ma być wykonane w osobnej metodzie z której ma zostać zwrócona wartość.
 */

package calculators;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: ");
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
                dodawanie(x, y);
                break;

            case "-":
                odejmowanie(x, y);
                break;

            case "*":
                mnozenie(x, y);
                break;

            case "/":
                dzielenie(x, y);
                break;

        }
    }

    public static void dodawanie(int x, int y) {
        System.out.println(x + y);
    }

    public static void odejmowanie(int x, int y) {
        System.out.println(x - y);
    }

    public static void mnozenie(int x, int y) {
        System.out.println(x * y);
    }

    public static void dzielenie(int x, int y) {
        System.out.println(x / y);
    }
}
