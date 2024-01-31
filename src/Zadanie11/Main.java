package Zadanie11;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Seba", "Kowal");
        Student student = new Student("Sebastian", "Kowalewski", 2);

        System.out.println(osoba.toString());

        System.out.println(student.toString());
    }
}
