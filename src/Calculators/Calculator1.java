/*
Wprowadź pierwszą liczbę
Wprowadź drugą liczbę
Wybierz działanie:
"+"
"-"
"*"
"/"
użyj pętli
 */

package Calculators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: ");
        int x = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę: ");
        boolean condition = true;
        int y = scanner.nextInt();

        while (condition) {
            System.out.println("Jakie działanie chcesz wykonać?\n" +
                    "+\n" +
                    "-\n" +
                    "*\n" +
                    "/\n");

            String choice = scanner.next();
            switch (choice) {
                case "+":
                    System.out.println(x + y);
                    break;

                case "-":
                    System.out.println(x + y);
                    break;

                case "*":
                    System.out.println(x + y);
                    break;

                case "/":
                    System.out.println(x + y);
                    break;
            }
            condition = false;
            System.exit(1);
        }
    }
}
