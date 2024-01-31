package Zadanie10;

public class Main {
    public static void main(String[] args) {
        Komunikat tresc = new Komunikat() {
            @Override
            public void wyswietl(String tresc) {
                System.out.println("Siemanko! " + tresc);
            }
        };
        tresc.wyswietl("Miłego Dnia!");
        tresc.wyswietl("Co tam u ciebie?");
        tresc.wyswietl("Lecimy na miasto?");
    }
}
