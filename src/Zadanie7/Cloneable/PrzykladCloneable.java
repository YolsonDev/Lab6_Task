package Zadanie7.Cloneable;

public class PrzykladCloneable {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba();
        osoba1.setImie("Sebastian");
        osoba1.setWiek(26);
        // Klonujemy obiekt
        try {
            Osoba osoba2 = (Osoba) osoba1.clone();

            // Modyfikujemy klon
            osoba2.setImie("Sebek");
            osoba2.setWiek(27);

            // Wyświetlamy oryginalny i zmodyfikowany obiekt
            System.out.println("Oryginalna osoba: " + osoba1);
            System.out.println("Zmodyfikowana osoba: " + osoba2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
