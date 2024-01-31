package Zadanie7.Comparable;

public class PrzykladComparable {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Sebastian");
        Osoba osoba2 = new Osoba("Damian");
        Osoba osoba3 = new Osoba("Sebastian");

        // Prównanie imion
        int prownanie1 = osoba1.compareTo(osoba2);
        int prownanie2 = osoba1.compareTo(osoba3);


        if(prownanie1 == 0) {
            System.out.println("Imie Osoba1 i imie Osoba2 są takie same");
        }else {
            System.out.println("Imiona się róźnią");
        }
        if(prownanie2 == 0) {
            System.out.println("Imie Osoba1 i imie Osoba3 są takie same");
        }else {
            System.out.println("Imiona się róźnią");
        }
    }
}
