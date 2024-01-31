package Zadanie4;

public class Osoba {
    private String name;
    private int age;

    public Osoba(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Osoba person = (Osoba) obj;
        return age == person.age && name.equals(person.name);
    }
}
