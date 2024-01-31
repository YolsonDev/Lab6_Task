package Zadanie7.Serializable;

import java.io.Serializable;

public class Osoba implements Serializable {
    private static long serialVersionUID = 1L;
    private String imie;
    private int wiek;
    public Osoba(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }
    @Override
    public String toString() {
        return "Osoba{imie='" + imie + "', wiek=" + wiek + '}';
    }
}
