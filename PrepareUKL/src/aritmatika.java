import java.util.Scanner;

public class aritmatika {
    public static void main(String[] args) {
        int deret = 100, deretangka = 0, increment = 3, nilaipertama = 0, nilaiakhir = nilaipertama;

        Scanner input = new Scanner(System.in);
        System.out.print("Nilai Suku Pertama = ");
        nilaipertama = input.nextInt();
        System.out.println("DERET SUKU DARI NILAI: " + nilaipertama + " (+3)");
        for (int i = 1; i <= deret; i++) {
            nilaipertama += increment;
            if (i >= 5 && i <= 30) {
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
