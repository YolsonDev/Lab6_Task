package Zadanie12;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        // Przykłady
        System.out.println("Dodawanie (int): " + kalkulator.dodaj(2,5));
        System.out.println("Dodawanie (double): " + kalkulator.dodaj(3.4,2.1));

        System.out.println("Odejmowanie (int): " + kalkulator.odejmij(8, 3));
        System.out.println("Odejmowanie (double): " + kalkulator.odejmij(8.5, 3.2));

        System.out.println("Mnożenie (int): " + kalkulator.mnozenie(5, 3));
        System.out.println("Mnożenie (double): " + kalkulator.mnozenie(7.5, 3));

        System.out.println("Dzielenie (int): " + kalkulator.dzielenie(6, 3));
        System.out.println("Dzielenie (double): " + kalkulator.dzielenie(8, 3));

        System.out.println("Potęga (int): " + kalkulator.potega(2, 8));
        System.out.println("Potęga (double): " + kalkulator.potega(2.5, 2));
    }
}
