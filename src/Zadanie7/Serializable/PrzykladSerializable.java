package Zadanie7.Serializable;

import java.io.*;

public class PrzykladSerializable {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy Osoba
        Osoba osoba = new Osoba("Sebastian", 26);

        // Serializacja do pliku
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("osoba.ser"))) {
            outputStream.writeObject(osoba);
            System.out.println("Obiekt został zapisany do pliku.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializacja z pliku
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("osoba.ser"))) {
            Osoba odczytanaOsoba = (Osoba) inputStream.readObject();
            System.out.println("Odczytano obiekt z pliku: " + odczytanaOsoba);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
