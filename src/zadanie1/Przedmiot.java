package zadanie1;

public class Przedmiot {
    private double szerokosc;
    private double wysokosc;
    private double glebokosc;
    private int waga;

    public Przedmiot(double szerokosc, double wysokosc, double glebokosc, int waga) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.glebokosc = glebokosc;
        this.waga = waga;
    }

    public void WymiarTest() {
        if (waga > 25) {
            System.out.println("Nie można przesłać przedmiotu, zbyt duża waga\033[0;91m " + waga + " kg!\033[0m");
        }
        if (szerokosc > 410) {
            System.out.println("Nie można przesłać przedmiotu, zbyt duża szerokość\033[0;91m " + szerokosc + " mm!\033[0m");
        }
        if (wysokosc > 380) {
            System.out.println("Nie można przesłać przedmiotu, zbyt duża wysokość\033[0;91m " + wysokosc + " mm!\033[0m");
        }
        if (glebokosc > 640) {
            System.out.println("Nie można przesłać przedmiotu, zbyt duża głębokość\033[0;91m " + glebokosc + " mm!\033[0m");
        } else {
            Wycena();
        }
    }

    public void Wycena() {
        if (szerokosc <= 80 && wysokosc <= 380 && glebokosc <= 640 && waga <= 25) {
            System.out.println("Paczka typu A, koszt\033[0;92m 12,99 PLN\033[0m");
        }
        if (szerokosc > 80 && szerokosc <= 190 && wysokosc <= 380 && glebokosc <= 640 && waga <= 25) {
            System.out.println("Paczka typu B, koszt\033[0;92m 13,99 PLN\033[0m");
        }
        if (szerokosc > 190 && szerokosc <= 410 && wysokosc <= 380 && glebokosc <= 640 && waga <= 25) {
            System.out.println("Paczka typu C, koszt\033[0;92m 15,49 PLN\033[0m");
        }
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public double getGlebokosc() {
        return glebokosc;
    }

    public int getWaga() {
        return waga;
    }

    @Override
    public String toString() {
        return "Przedmiot{" +
                "szerokosc=" + szerokosc +
                ", wysokosc=" + wysokosc +
                ", glebokosc=" + glebokosc +
                ", waga=" + waga +
                '}';
    }
}
