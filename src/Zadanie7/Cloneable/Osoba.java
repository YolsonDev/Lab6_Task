package Zadanie7.Cloneable;

public class Osoba implements Cloneable{
    private String imie;
    private int wiek;

    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public int getWiek() {
        return wiek;
    }
    public String getImie() {
        return imie;
    }
    @Override
    public String toString() {
        return "Osoba{imie='" + imie + "', wiek=" + wiek + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Wywołanie metody klasy bazowej
    }
}
