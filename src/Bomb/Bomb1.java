/* Napisz program, który pobierze od użytkownika całkowitą liczbę dodatnią. Następnie wyświetl na ekranie Odliczanie z tekstem
"Bomba wybuchnie za ... " gdzie w miejsce dwukropka mają się pojawić liczby od podanej przez użytkownika do 0.
 Napisz program w 3 wersjach przy użyciu różnych pętli.
*/

package Bomb;

import java.util.Scanner;

public class Bomb1 {
    public static void main(String[] args) {
        System.out.println("Uwaga bomba!");
        Scanner komunikat = new Scanner(System.in);
        int zegar;

        System.out.println("Wprowadź liczbę całkowitą nicponiu: ");
        zegar = komunikat.nextInt();

        while (zegar > 0) {
            System.out.println("Bomba wybuchnie za: " + zegar + " frajerze");
            zegar--;
        }
        System.out.println("NIE ŻYJESZ MORDECZKO");
    }
}
