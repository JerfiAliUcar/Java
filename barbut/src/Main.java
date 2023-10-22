import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BarbutOyunu oyun = new BarbutOyunu();
        oyun.oyunaBasla();
    }
}

class BarbutOyunu {

    private boolean birinciOyuncuSirasi;
    private boolean ikinciOyuncuSirasi;

    public BarbutOyunu() {

        this.birinciOyuncuSirasi = true;
        this.ikinciOyuncuSirasi = false;
    }

    public void oyunaBasla() {
        while (true) {
            if (birinciOyuncuSirasi) {
                int zar1 = zarAt();
                int zar2 = zarAt();

                if (kontrolEt(zar1, zar2, 1) == "Win") {

                    sonucuYazdir(true, 1);
                    break;
                } else if (kontrolEt(zar1, zar2, 1) == "Continue") {
                    birinciOyuncuSirasi = false;
                    ikinciOyuncuSirasi = true;
                } else {
                    sonucuYazdir(false, 1);
                }
            } else if (ikinciOyuncuSirasi) {
                int zar1 = zarAt();
                int zar2 = zarAt();
                if (kontrolEt(zar1,zar2,2)=="Win") {

                    sonucuYazdir(true, 2);
                    break;
                } else if(kontrolEt(zar1,zar2,2)== "Continue") {
                    birinciOyuncuSirasi = true;
                    ikinciOyuncuSirasi = false;
                }else {
                    sonucuYazdir(false,2);
                }
            }
        }
    }

    public int zarAt() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public String kontrolEt(int zar1, int zar2, int oyuncu) {
        if ((zar1 == 6 && zar2 == 6) || (zar1 == 5 && zar2 == 5) || (zar1 == 3 && zar2 == 3) || (zar1 + zar2 == 7)) {
            return "Win";
        } else if ((zar1 == 4 && zar2 == 4) || (zar1 == 2 && zar2 == 2) || (zar1 == 1 && zar2 == 1)) {
            return "Lose";
        } else {
            return "Continue";
        }
    }

    public void sonucuYazdir(boolean kazananMi, int oyuncu) {
        if (kazananMi) {
            System.out.println("Oyuncu " + oyuncu + " kazandı!");
        } else {
            System.out.println("Oyuncu " + oyuncu + " kaybetti!");
        }
    }
}


