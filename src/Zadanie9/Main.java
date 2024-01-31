package Zadanie9;


public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Sebastian", "Kowalewski", "Informatyk") {
            @Override
            public void wyswietlInfo() {
                System.out.println("Szczegółowe informacje o pracowniku");
                super.wyswietlInfo();
            }
        };
        pracownik.wyswietlInfo();

    }
}
