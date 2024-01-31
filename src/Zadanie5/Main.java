package Zadanie5;

public class Main {
    public static void main(String[] args) {
        Klasa klasa = new Klasa();

        // Rzutować klasy na implementowany interfejs.
        Interfejs interfejs = klasa;
        interfejs.metodaInterfejsu();
    }
}
