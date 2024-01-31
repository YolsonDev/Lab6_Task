package Zadanie11;

public class Student extends Osoba{
    int rokStudiow;
    public Student(String imie, String nazwisko, int rokStudiow){
        super(imie,nazwisko);
        this.rokStudiow = rokStudiow;
    }

    @Override
    public String toString(){
        return "Student: " + imie + " " + nazwisko + ", rok studiów: " + rokStudiow;
    }
}
