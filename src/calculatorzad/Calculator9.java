/*
Kalkulator ma wszystkie funkcje
Dodatkowo wszystkie działania mają być zapisywane w jakiejś strukturze danych,
W taki sposób żeby mieć dodatkową opcje 4. Wypisz wszystkie wykonane działania
np. 2+2=4
3+3=6
4+4=8

1. Zapisywanie x  + y + resultat do listy/tablicy jako metoda lista
2. wydruk listy
 */

package calculatorzad;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator9 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Calculator\n" +
                    "2. Exit\n" +
                    "3. Print\n");
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


                    int result5 = 0;

                    switch (choice1) {
                        case "+":
                            int result = add(x, y);
                            System.out.println("Wynik: " + result);
                            result5 = result;
                            break;

                        case "-":
                            int result1 = substract(x, y);
                            System.out.println("Wynik: " + result1);
                            result5 = result1;
                            break;

                        case "*":
                            int result2 = multiplication(x, y);
                            System.out.println("Wynik: " + result2);
                            result5 = result2;
                            break;

                        case "/":
                            int result3 = division(x, y);
                            System.out.println("Wynik: " + result3);
                            result5 = result3;
                            break;
                    }

                    arrayList.add(x + " " + choice1 + " " + y + " " + "=" + " " + result5);

                    break;
                case "2":
                    exit();
                    break;

                case "3":
                    int val = 0;
                    while (arrayList.size() > val) {
                        System.out.println(arrayList.get(val));
                        val++;
                    }
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