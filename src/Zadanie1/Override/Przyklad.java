package Zadanie1.Override;

class Zwierze {
    void dajGlos() {
        System.out.println("Dźwięk zwierzęcia");
    }
}
class Pies extends Zwierze {
    @Override
    void dajGlos() {
        System.out.println("Hau, hau!");
    }
}
public class Przyklad {
    public static void main(String[] args) {
        Pies pies = new Pies();
        pies.dajGlos(); // Wyświetli: Hau, hau!
    }
}
