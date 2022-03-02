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

1 intefejs z metedodami + exit + pierwiastek + +-* dziel
jedna implementacja interfejsu czyli ta scientific ma wypisywać metodę że jest nieobsługiwana
jeśli użytkownik będzie chciał pierwiastkować
 */

package calculatorinterface;

public interface CalculatorInterface {
    String nazwaInterfejsu = "CalculatorInterface";
int add(int x, int y);
    int subtract(int x, int y);
    int multiply(int x, int y);
    int divide(int x, int y);
    double sqrt(int x);
}
