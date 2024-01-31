package Zadanie7.Comparable;

public class Osoba implements Comparable<Osoba> {
    private String imie;
    public Osoba(String imie){
        this.imie = imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }
    @Override
    public int compareTo(Osoba innaOsoba) {
        // Porównywanie książek na podstawie tytułu
        return this.imie.compareTo(innaOsoba.imie);
    }

    @Override
    public String toString() {
        return "Imie: ";
    }
}
