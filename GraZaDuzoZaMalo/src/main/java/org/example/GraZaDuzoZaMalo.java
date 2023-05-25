package org.example;

import java.util.Random;
import java.util.Scanner;

public class GraZaDuzoZaMalo {

    private final Scanner scanner;
    private int liczbaWylosowanaPrzezKomputer;

    public GraZaDuzoZaMalo() {
        this.scanner = new Scanner(System.in);
        this.liczbaWylosowanaPrzezKomputer = getLiczbaWylosowanaPrzezKomputer();
    }

    public int getLiczbaWylosowanaPrzezKomputer() {
        Random random = new Random();
        liczbaWylosowanaPrzezKomputer = random.nextInt(101);
        return liczbaWylosowanaPrzezKomputer;
    }
    public void zagrajWzaDuzoZaMalo() {
        System.out.println("Komputer wylosował liczbę z zakresu 0-100. Odgadnij ją!");
        int liczbaUzytkownika;
        do {
            System.out.print("Podaj liczbę: ");
            liczbaUzytkownika = scanner.nextInt();

            switch (Integer.compare(liczbaUzytkownika, liczbaWylosowanaPrzezKomputer)) {
                case 1 -> System.out.println("Za dużo!");
                case -1 -> System.out.println("Za mało!");
                default -> System.out.println("Bingo! Zgadłeś!");
            }
        } while (liczbaUzytkownika != liczbaWylosowanaPrzezKomputer);
    }

}
