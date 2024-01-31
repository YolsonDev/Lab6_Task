package Zadanie11;

public class Osoba {
    String imie;
    String nazwisko;
    public Osoba(String imie, String naziwsko){
        this.imie = imie;
        this.nazwisko = naziwsko;
    }
    @Override
    public String toString(){
        return "Osoba: " + imie + " " + nazwisko;
    }
}
