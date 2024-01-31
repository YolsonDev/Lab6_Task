package Zadanie6;


public class Main {
    public static void main(String[] args) {
        Komunikat powitanie = new Komunikat() {
            @Override
            public void podajimie(String imie) {
                System.out.println("Witaj " + imie);
            }
        };
        powitanie.podajimie("Sebastian");
    }
}
