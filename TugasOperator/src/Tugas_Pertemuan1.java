public class Tugas_Pertemuan1 {
    public static void main(String[] args) throws Exception {
        int semangka = 7, jambu = 3;
        double harga_jambu = 2340.2, harga_semangka = 3000.2;
        int total;
        double bayar;

        jambu -= 2;
        semangka -= 3;
        total = semangka + jambu;
        System.out.println("Jumlah barang yang tersedia = " + semangka + "+" + jambu + "=" + total);

        bayar = (jambu * harga_jambu) + (semangka * harga_semangka);
        System.out.println("Total aset yang dimiliki = Rp" + bayar);
    }
}
