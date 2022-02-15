public class uklno1 {
    public static void main(String[] args) {

        int deret = 30, deretangka = 0, increment = 4, nilaipertama = 17, nilaiakhir = nilaipertama;
        System.out.println("DERET SUKU DARI NILAI: " + nilaipertama + " (+4)");
        for (int i = 2; i <= deret; i++) {
            nilaipertama += increment;
            if (i >= 19 && i <= 30) {
                System.out.println(nilaipertama + " Deret ke-" + i);
                nilaiakhir += nilaipertama;
                deretangka += 1;
            }
        }
        deretangka -= 1;
        nilaiakhir -= nilaipertama;
        System.out.println("Jumlah Deret = " + deretangka);
        System.out.println("Jumlah deret aritmatika = " + nilaiakhir);
    }
}
