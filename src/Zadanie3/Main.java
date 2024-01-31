package Zadanie3;

public class Main {
    public static void main(String[] args) {
        Figura[] figury = new Figura[3];

        figury[0] = new Kwadrat();
        figury[1] = new Kolo();
        figury[2] = new Prostokat();

        for(Figura figura : figury){
            figura.rysuj();
        }

    }
}
