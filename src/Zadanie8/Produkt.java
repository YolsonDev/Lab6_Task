package Zadanie8;

public class Produkt implements Zamowienie{
    private String nazwa;
    private double cena;
    Produkt(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public double obliczCene() {
        return cena * 1.23;
    }

    @Override
    public void pokazSzczegoly() {
        System.out.println("Nazwa produktu: " + nazwa +
                "\nKoszt usługi: " + cena);
    }
}
