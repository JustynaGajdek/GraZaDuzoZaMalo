package org.example;

import java.util.Random;
import java.util.Scanner;

public class GraZaDuzoZaMalo {

    private int liczbaUzytkownika;
    private Scanner scanner;
    private int liczbaWylosowanaPrzezKomputer;

    public GraZaDuzoZaMalo(Scanner scanner, int liczbaWylosowanaPrzezKomputer) {
        this.scanner = scanner;
        this.liczbaWylosowanaPrzezKomputer = getLiczbaWylosowanaPrzezKomputer();
    }

    public int getLiczbaWylosowanaPrzezKomputer() {
        Random random = new Random();
        liczbaWylosowanaPrzezKomputer = random.nextInt(101);
        return liczbaWylosowanaPrzezKomputer;
    }

    public void zagrajWzaDuzoZaMalo() {
        System.out.println("Komputer wylosował liczbę z zakresu 0-100. Odgadnij ją!");
        do {
            System.out.print("Podaj liczbę: ");
            liczbaUzytkownika = scanner.nextInt();

            switch (Integer.compare(liczbaUzytkownika, liczbaWylosowanaPrzezKomputer)) {
                case 1:
                    System.out.println("Za dużo!");
                    break;
                case -1:
                    System.out.println("Za mało!");
                    break;
                default:
                    System.out.println("Bingo! Zgadłeś!");
                    break;
            }
        } while (liczbaUzytkownika != liczbaWylosowanaPrzezKomputer);
    }

}
