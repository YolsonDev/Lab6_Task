package Zadanie4;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Sebastian", 26);
        Osoba osoba2 = new Osoba("Sebastian", 26);
        Osoba osoba3 = new Osoba("Darek", 21);

        // Prównywanie osób
        System.out.println("Czy obiekty są równe? osoba1 i osoba2: " + osoba1.equals(osoba2));
        System.out.println("Czy obiekty są równe? osoba1 i osoba3: " + osoba1.equals(osoba3));
    }
}
