package Zadanie1.Przysloniecie;

class Zwierze {
    void dajGlos() {
        System.out.println("Dźwięk zwierzęcia");
    }
}
class Pies extends Zwierze {
    // Przesłaniamy metodę dajGlos z klasy Zwierze
    void dajGlos() {
        System.out.println("Hau, hau!");
    }
}
public class Przyklad {
    public static void main(String[] args) {
        Zwierze zwierze = new Zwierze();
        zwierze.dajGlos(); // Wyświetli: Dźwięk zwierzęcia.
        Pies pies = new Pies();
        pies.dajGlos(); // Wyświetli: Hau, hau!
        // Przy użyciu referencji klasy nadrzędnej
        Zwierze zwierze2 = new Pies();
        zwierze2.dajGlos(); // Wywoła metodę z klasy Pies: Hau, hau!
    }
}

