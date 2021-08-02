package zadanie1;

import java.util.Arrays;
import java.util.Scanner;

public class PaczkaTest {
    public static void main(String[] args) {

        System.out.println("\033[0;94m______________________________________________________\033[0m");
        System.out.print("Podaj wymiary paczki: ");
        Scanner in = new Scanner(System.in);

        String dane = in.nextLine();
        dane = dane.replace(" x", "");
        String[] tablica = dane.split(" ");
        System.out.println(Arrays.toString(tablica));

        double szerokosc = Double.parseDouble(tablica[0]);
        double wysokosc = Double.parseDouble(tablica[1]);
        double glebokosc = Double.parseDouble(tablica[2]);
        int waga = Integer.parseInt(tablica[3]);

        double[] dane2 = {szerokosc, wysokosc, glebokosc};
        Arrays.sort(dane2);

        Przedmiot paczka = new Przedmiot(szerokosc, wysokosc, glebokosc, waga);
        paczka.WymiarTest();
        System.out.println("\033[0;94m______________________________________________________\033[0m");

    }
}
