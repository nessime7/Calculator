package Bomb;

import java.util.Scanner;

public class Bomb3 {
    public static void main(String[] args) {
        System.out.println("Uwaga bomba!");
        Scanner komunikat = new Scanner(System.in);
        int zegar;

        System.out.println("Wprowadź liczbę całkowitą: ");
        for (zegar = komunikat.nextInt(); zegar > 0; zegar--)
            System.out.println("Bomba wybuchnie za: " + zegar);
        System.out.println("BUM SZAKA LAKA");
    }
}
