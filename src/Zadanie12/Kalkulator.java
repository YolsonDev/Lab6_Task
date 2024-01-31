package Zadanie12;

public class Kalkulator {
    public int dodaj(int a, int b){
        return a + b;
    }
    public double dodaj(double a, double b){
        return a + b;
    }
    public int odejmij(int a, int b){
        return a - b;
    }
    public double odejmij(double a, double b){
        return a - b;
    }
    public int mnozenie(int a, int b){
        return a * b;
    }
    public double mnozenie(double a, double b){
        return a * b;
    }
    public int dzielenie(int a, int b){
        if (b != 0) {
            return a / b;
        } else {
            return Integer.parseInt("Nie można dzielić przez 0");
        }
    }
    public double dzielenie(double a, double b){
        if (b != 0) {
            return a / b;
        } else {
            return Integer.parseInt("Nie można dzielić przez 0");
        }
    }
    public int potega(int podstawa, int wykladnik) {
        return (int) Math.pow(podstawa, wykladnik);
    }
    public double potega(double podstawa, double wykladnik) {
        return Math.pow(podstawa, wykladnik);
    }
}
