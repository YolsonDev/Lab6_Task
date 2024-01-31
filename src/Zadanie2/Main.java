package Zadanie2;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Figura();
        Kwadrat kwadrat = new Kwadrat();

        // Przesłonięcie
        kwadrat.rysuj();

        // Przeciążenie
        kwadrat.rysuj(4);

        // Przeciążenie między klasą a jej klasą bazową
        figura = new Kwadrat();
        figura.rysuj();
    }
}
