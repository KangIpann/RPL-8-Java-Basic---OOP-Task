import java.util.Scanner;

public class SeleksiCottageJadi {
    public static void main(String[] args) {
        int harga = 0;
        Scanner input = new Scanner(System.in);
        String idnama[] = { "Ali", "Budi", "Dani", "Edi", "Umar" };
        System.out.println("============= Selamat Datang Di Bhakti Alam =============");
        System.out.print("Masukan ID Pelanggan = ");
        int idpelanggan = input.nextInt();
        System.out.print("Masukan Tipe Cottage = ");
        String cottage = input.next();
        System.out.print("Masukan Hari Jenis Hari = ");
        String hariinap = input.next();
        System.out.print("Masukan Jumlah hari inap = ");
        int totalhari = input.nextInt();
        System.out.println("============================================================");
        System.out.println("Nama Pelanggan Anda adalah = " + idnama[idpelanggan - 1]);
        System.out.println("Tipe Cottage Anda Adalah = " + cottage);
        System.out.println("Jumlah hari inap anda adalah = " + hariinap);
        System.out.println("Total biaya yang harus dikeluarkan adalah = " + biaya(cottage, totalhari, hariinap, harga));
    }

    public static int biaya(String cottage, int hari, String tipehari, int harga) {
        if (cottage.equalsIgnoreCase("Duku") || cottage.equalsIgnoreCase("Jeruk")) {
            if (tipehari.equalsIgnoreCase("weekday")) {
                harga = 915000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("weekend")) {
                harga = 1025000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("holiday")) {
                harga = 1225000;
                harga *= hari;
            }
        } else if (cottage.equalsIgnoreCase("Alpukat") || cottage.equalsIgnoreCase("Jambu Air")) {
            if (tipehari.equalsIgnoreCase("weekday")) {
                harga = 575000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("weekend")) {
                harga = 695000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("holiday")) {
                harga = 895000;
                harga *= hari;
            }
        } else if (cottage.equalsIgnoreCase("Durian") || cottage.equalsIgnoreCase("Melon")) {
            if (tipehari.equalsIgnoreCase("weekday")) {
                harga = 595000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("weekend")) {
                harga = 715000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("holiday")) {
                harga = 915000;
                harga *= hari;
            }
        } else if (cottage.equalsIgnoreCase("Belimbing") || cottage.equalsIgnoreCase("Mangga")
                || cottage.equalsIgnoreCase("Kedondong")) {
            if (tipehari.equalsIgnoreCase("weekday")) {
                harga = 495000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("weekend")) {
                harga = 575000;
                harga *= hari;
            } else if (tipehari.equalsIgnoreCase("holiday")) {
                harga = 755000;
                harga *= hari;
            }
        }
        return harga;
    }
}
