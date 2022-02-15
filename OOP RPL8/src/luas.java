import java.util.*;

class cm {
    double panjang;
    double lebar;
    double luas;
}

public class luas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cm persegipanjang1 = new cm();
        System.out.println("Masukan panjang persegi panjang");
        persegipanjang1.panjang = scanner.nextDouble();
        System.out.println("Masukan lebar persegi panjang");
        persegipanjang1.lebar = scanner.nextDouble();

        persegipanjang1.luas  = persegipanjang1.panjang * persegipanjang1.lebar;
        System.out.println("Jadi total luas persegi panjang adalah = " + persegipanjang1.luas);
    }
}
