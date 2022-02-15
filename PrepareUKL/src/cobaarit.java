public class cobaarit {
    public static void main(String[] args) {
        int awal = 3, beda = 4, tampilawal = 2, tampilakhir = 6, nilaisukukex = awal, jumlahsuku = 0;
        for (int i = tampilawal; i <= tampilakhir; i++) {
            nilaisukukex = awal + (beda * (i - 1));
            System.out.println("Nilai suku ke : " + i + " adalah " + nilaisukukex);
            jumlahsuku += nilaisukukex;
        }
        System.out.println("Jumlah deret aritmatika tersebut adalah" + jumlahsuku);
    }
}
