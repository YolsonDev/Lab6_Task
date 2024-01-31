package Zadanie8;

public class Main {
    public static void main(String[] args) {
        Produkt laptop = new Produkt("Acer",1000);
        Usluga serwis = new Usluga("Wgrywanie Windowsa", 150);

        // Wyświetlanie ceny oraz obliczanie ceny
        laptop.pokazSzczegoly();
        System.out.println("Cena z podatkiem: " + laptop.obliczCene());

        serwis.pokazSzczegoly();
        System.out.println("Cena z podatkiem: " + serwis.obliczCene());
    }
}
