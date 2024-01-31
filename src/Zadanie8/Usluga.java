package Zadanie8;

public class Usluga implements Zamowienie{
    private String nazwa;
    private double koszt;
    Usluga(String nazwa, double cena){
        this.nazwa = nazwa;
        this.koszt = cena;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(double koszt) {
        this.koszt = koszt;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return koszt;
    }

    @Override
    public double obliczCene() {
        return koszt * 1.23;
    }

    @Override
    public void pokazSzczegoly() {
        System.out.println("Nazwa usługi: " + nazwa +
                "\nKoszt usługi: " + koszt);
    }}
