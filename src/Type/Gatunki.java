package Type;

public class Gatunki {
    public static <Lista> void main(String[] args) {
        System.out.println("Pies");
        Gatunek pies = new Gatunek("Wilk", "Ssak", 1, 1, "Przyjaciel człowieka");
        pies.wypiszDane();

        System.out.println(" ");

        System.out.println("Kot");
        Gatunek kot = new Gatunek("Kotowaty", "Ssak", 2, 2, "Ma wywalone na człowieka");
        kot.wypiszDane();

        System.out.println(" ");

        System.out.println("Gołąb");
        Gatunek gołąb = new Gatunek("Srające", "Ptak", 3, 3, "Lata");
        gołąb.wypiszDane();

    }
}
