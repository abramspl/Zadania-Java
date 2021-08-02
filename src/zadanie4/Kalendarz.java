package zadanie4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Kalendarz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Podaj datę (rrrr mm dd): ");
        //wprowadzamy datę
        int rok = scanner.nextInt();
        int month = scanner.nextInt();
        int today = scanner.nextInt();
        LocalDate date = LocalDate.of(rok,month,today);

        //ustawiamy zmienna 'date' na pierwszy dzień miesiąca i pobieramy dzień tygodnia dla tej daty
        date = date.minusDays(today - 1);   //ustawienie na początek miesiąca
        DayOfWeek weekday = date.getDayOfWeek();
        //pobieramy numeryczna wartość dnia tygodnia (jest to liczba całkowita zgodna z międzynarodowym zwyczajem)
        int value = weekday.getValue();     //1=poniedziałek, ..., 7=niedziela

        System.out.println();
        System.out.println("\033[0;93m" + date.getMonth()+"\t" + date.getYear()+"\033[0m");
        System.out.println("\033[0;94m___________________________\033[0m");
        System.out.println("Pon\tWto\tŚro\tCzw\tPią\tSob\t\033[0;91mNie\033[0m");
        for (int i = 1; i < value; i++) {
            System.out.print("\t");
        }
        //za pomocą obiektu 'date' przegladamy dni miesiąca
        while (date.getMonthValue() == month) {
            System.out.print(date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("\033[0;93m*\t\033[0m");   //podany dzień zaznaczamy gwiazdką
            } else {
                System.out.print("\t");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
                ;
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();       //gdy znajdujemy początek tygodnia, drukujemy znak nowego wiersza
        }                               //powtarzamy pętlę dopóki 'date' mieści się w bieżącym miesiącu.
        System.out.println("\033[0;94m___________________________\033[0m");
    }
}
