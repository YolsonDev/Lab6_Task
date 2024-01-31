package Zadanie9;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private String stanowisko;
    public Pracownik(String imie, String nazwisko, String stanowisko ){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }
    public void wyswietlInfo(){
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Stanowisko: " + stanowisko);
    }
}
