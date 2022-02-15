import java.util.Scanner;

public class PenugasanOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Biodata
        String nama = "Arialdo Rivandi Tion Saputra";
        String kelas = "XR8";
        String alamat = "Jalan Abdul Salam Doko Kec doko Kab Blitar";
        String hobi = "Ngopi dan Ngoding";
        String umur = "15";
        // Biodata Output
        System.out.println("Hai, Nama saya adalah " + nama);
        System.out.println("Kelas saya adalah " + kelas);
        System.out.println("Alamat saya adalah " + alamat);
        System.out.println("Hobi saya adalah " + hobi);
        System.out.println("Umur saya adalah " + umur);
        System.out.println("");
        // Rumus luas Segitiga
        double alas;
        double tinggi;
        System.out.printf("Kalkulator Penghitung Alas Segitiga\n");
        System.out.printf("Masukan Alas Segitiga = ");
        alas = input.nextInt();
        System.out.printf("Masukan Tinggi Segitiga = ");
        tinggi = input.nextInt();
        double luasSegitiga = (alas + 5) * 0.5 * tinggi;
        System.out.println("Hasil Luas Segitiga adalah = " + luasSegitiga);

        // Rumus luas Lingkaran
        double jariJari;
        double phi;
        double phi1 = 3.14;
        double phi2 = 22 / 7;
        System.out.printf("Kalkulator Penghitung Alas Lingkaran\n");
        System.out.printf("Masukan Jari Jari Lingkaran= ");
        jariJari = input.nextInt();
        System.out.printf("Masukan Phi Lingkaran masukan dalam bentuk desimal. Contoh(3.14) = ");
        phi = input.nextDouble();
        double luasLingkaran = (jariJari + 5) * (jariJari + 5) * phi;
        System.out.printf("Hasil Luas Lingakaran adalah = " + luasLingkaran);
    }
}
// nama kelas alamat hobi umur
// luas segitiga + luas lingkaran