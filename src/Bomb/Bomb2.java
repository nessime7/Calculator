package Bomb;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bomb2 {
    public static void main(String[] args) {
        System.out.println("Uwaga bomba!");
        Scanner komunikat = new Scanner(System.in);
        int zegar;

        System.out.println("Wprowadź liczbę całkowitą nicponiu: ");
        zegar = komunikat.nextInt();

        do {
            System.out.println("Bomba wybuchnie za: " + zegar + " frajerze");
            zegar--;
        }
        while (zegar > 0);
        System.out.println("NIE ŻYJESZ MORDO");
    }
}