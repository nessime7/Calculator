/* Ok Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
Ok MyNumber isOdd() – true jeśli atrybut jest nieparzysty,
Ok MyNumber isEven() – true jeśli atrybut jest parzysty,
Ok MyNumber sqrt() – pierwiastek z atrybutu,
Ok MyNumber pow(MyNumber x) – atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
Ok MyNumber add(MyNumber x) – zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
Ok MyNumber subtract(MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.
I w metodzie main stworz instancje klasy oraz sprawdz wszystkie metody na dowolnych danych
 */

package MyNumber;

public class MyNumber {

    private final int x;

    public MyNumber(int x) {
        this.x = x;
    }

    public boolean isOdd(double number) {
        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven(double number) {
        if (number % 2 == 0) {
            //if (number % 2 != 1) {
            return true;
        } else {
            return false;
        }
    }

    public double sqrt(double number) {
        double x = Math.sqrt(number);
        return x;
    }

    public double pow(double number) {
        double result = Math.pow(number,x);
        return result;
    }

    public double add(double number) {
        double result = number + x;
        return result;
    }

    public double subtract(double number) {
        double result = number - x;
        return result;
    }
}
