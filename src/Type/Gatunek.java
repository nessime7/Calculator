/*
Zadanie
Stwórz program w którym będzie utworzonych kilka obiektów typu Gatunek
Klasa Gatunek powinna zawierać:

pola przechowujące:
nazwę rodzaju
nazwę gatunkową
liczbę chromosomów 2n
podstawową liczbę chromosomów x
opis
metody:
podającą pełną nazwę (Rodzaj + gatunek)
podającą haploidalną liczbę chromosomów n
wypisującą wszystkie dane
klonującą obiekt – metoda powinna zwracać odnośnik do nowego obiektu typu Gatunek o wartościach pól takich samych jak w obiekcie, w którym została wywołana.
 */

package Type;

public class Gatunek {
    String rodzaj;
    String gatunek;
    int liczbaChromosomow2n;
    int podstawowaLiczbaChromosomow;
    String opis;

    public Gatunek(String rodzaj, String gatunek, int liczbaChromosomow2n, int podstawowaLiczbaChromosomow, String opis) {
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.liczbaChromosomow2n = liczbaChromosomow2n;
        this.podstawowaLiczbaChromosomow = podstawowaLiczbaChromosomow;
        this.opis = opis;
    }

    public Gatunek() {}

    // Podaj pełną nazwę (Rodzaj + gatunek)
    public String podajPelnaNazwe() {
        return rodzaj + " " + gatunek;
    }

    //Podaj haploidalną liczbę chromosomów n
    public int podajHapaloidalnaLiczbeChromosoown() {
        return liczbaChromosomow2n / 2;
    }

    // Wypisz wszystkie dane
    public void wypiszDane() {
        System.out.println("Rodzaj: " + rodzaj);
        System.out.println("Gatunek: " + gatunek);
        System.out.println("Liczba chromosomów: " + liczbaChromosomow2n);
        System.out.println("Podstawowa liczba chromosomów: " + podstawowaLiczbaChromosomow);
        System.out.println("Opis: " + opis);
    }

    //klonującą obiekt – metoda powinna zwracać odnośnik do nowego obiektu typu Gatunek o wartościach pól takich samych jak w obiekcie, w którym została wywołana.
    public Gatunek klonuj() {
        Gatunek klon = new Gatunek();
        klon.rodzaj = rodzaj;
        klon.gatunek = gatunek;
        klon.liczbaChromosomow2n = liczbaChromosomow2n;
        klon.podstawowaLiczbaChromosomow = podstawowaLiczbaChromosomow;
        klon.opis = opis;
        return klon;
    }
}
