package Zadanie2;

public class Kwadrat extends Figura {
    void rysuj(){
        System.out.println("Rysuje kwadrat");
    }
    // Przeciązenie metody rysuj z dodatkowym prametrem
    void rysuj(int bok){
        System.out.println("Rysuje kwadrat o boku " + bok);
    }
}
