import java.util.Scanner;

public class seleksikondisi {
    public static void main(String[] args) {
        while (true) {

            int harga = 0;
            Scanner input = new Scanner(System.in);
            String idnama[] = { "Ali", "Budi", "Dani", "Edi", "Umar" };
            int id[] = { 1, 2, 3, 4, 5 };
            String pilihcottage[] = { "Duku", "Jeruk", "Alpukat", "Jambu Air", "Durian", "Melon", "Belimbing", "Mangga",
                    "Kedondong" };
            System.out.println("============= Selamat Datang Di Bhakti Alam =============");
            System.out.print("Masukan ID Pelanggan = ");
            int idpelanggan = input.nextInt();
            if (idpelanggan > 5 || idpelanggan < 1) {
                System.out.println("INPUT TIDAK ADA\nINPUTKAN ID DENGAN BENAR");
                continue;
            }
            System.out.print("Masukan Tipe Cottage = ");
            String cottage = input.next();
            if (cek(cottage) == 0) {
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
                    "Total biaya yang harus dikeluarkan adalah = " + biaya(cottage, totalhari, hariinap, harga));
            break;
        }

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

    public static int cek(String cottage) {
        int harga = 0;
        if (cottage.equalsIgnoreCase("Duku") || cottage.equalsIgnoreCase("Jeruk")) {
            harga = 915000;
        } else if (cottage.equalsIgnoreCase("Alpukat") || cottage.equalsIgnoreCase("Jambu Air")) {
            harga = 895000;
        } else if (cottage.equalsIgnoreCase("Durian") || cottage.equalsIgnoreCase("Melon")) {
            harga = 915000;
        } else if (cottage.equalsIgnoreCase("Belimbing") || cottage.equalsIgnoreCase("Mangga")
                || cottage.equalsIgnoreCase("Kedondong")) {
            harga = 495000;
        }
        return harga;
    }
}
