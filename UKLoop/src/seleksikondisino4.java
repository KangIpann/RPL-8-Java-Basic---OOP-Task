import java.util.Scanner;

public class seleksikondisino4 {

    public static void main(String[] args) {
        ukl7 sistem = new ukl7();

        while (true) {

            int harga = 0;
            Scanner input = new Scanner(System.in);
            String idnama[] = { "Ali", "Budi", "Dani", "Edi", "Umar" };
            System.out.println("============= Selamat Datang Di Bhakti Alam =============");
            System.out.print("Masukan ID Pelanggan = ");
            int idpelanggan = input.nextInt();
            if (idpelanggan > 5 || idpelanggan < 1) {
                System.out.println("INPUT TIDAK ADA\nINPUTKAN ID DENGAN BENAR");
                continue;
            }
            System.out.print("Masukan Tipe Cottage = ");
            String cottage = input.next();
            if (sistem.cek(cottage) == 0) {
                System.out.println("INPUT TIDAK ADA\nINPUTKAN ID DENGAN BENAR");
                continue;
            }
            System.out.print("Masukan Hari Jenis Hari = ");
            String hariinap = input.next();
            if (hariinap.equalsIgnoreCase("weekday") || hariinap.equalsIgnoreCase("weekend")
                    || hariinap.equalsIgnoreCase("holiday")) {
            } else {
                System.out.println("INPUT TIDAK ADA\nINPUTKAN ID DENGAN BENAR");
                continue;
            }
            System.out.print("Masukan Jumlah hari inap = ");
            int totalhari = input.nextInt();
            System.out.println("============================================================");
            System.out.println("Nama Pelanggan Anda adalah = " + idnama[idpelanggan - 1]);
            System.out.println("Tipe Cottage Anda Adalah = " + cottage);
            System.out.println("Jumlah hari inap anda adalah = " + hariinap);
            System.out.println(
                    "Total biaya yang harus dikeluarkan adalah = " + sistem.biaya(cottage, totalhari, hariinap, harga));
            break;
        }

    }

}
