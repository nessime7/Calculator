package Draw;

import java.util.Random;
import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int i = 0;
        int los;
        int odp;

        Random rnd = new Random();
        los = rnd.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbę od 1 do 10!");

        do {
            i++;
            System.out.println("Podaj liczbę: ");
            odp = scanner.nextInt();

            if (odp > los) {
                System.out.println("Niestety nie zgadłeś! Moja licza jest mniejsza.");
            } else if (odp < los) {
                System.out.println("Niestety nie zgadłeś! Moja liczba jest większa.");
            }
        } while (odp != los);
        System.out.println("Brawo odgadłeś za " + i + " razem!");
    }
}
