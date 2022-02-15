import java.util.Scanner;

import javax.swing.JOptionPane;

public class barang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String datajual[][] = { { "Nama Barang: ", "Meja", "Harga : ", "Rp.800.000" },
                { "Nama Barang: ", "Kursi", "Harga : ", "Rp.430.000" },
                { "Nama Barang: ", "Lilin", "Harga : ", "120.0000" } };
        int a, b, c, d;
        String inputj, konfirmasi;
        JOptionPane.showMessageDialog(null, "Selamat Datang Di Menu Beli Barang", "Selamat Berbelanja!",
                JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < datajual.length; i++) {
            for (int j = 0; j <= datajual.length; j++) {
                System.out.print(datajual[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Masukan Input Barang: ");
        String id = input.next();
        System.out.print("Masukan Jumlah Barang: ");
        int jumlah = input.nextInt();
        for (int i = 0; i < datajual.length; i++) {
            for (int j = 0; j <= datajual.length; j++) {
                if (datajual[i][j].equalsIgnoreCase(id)) {
                    if (datajual[i][j].equalsIgnoreCase("Meja")) {
                        int hargabarang = 800000;
                    }
                    if (datajual[i][j].equalsIgnoreCase("Kursi")) {
                        int hargabarang = 430000;
                    }
                    if (datajual[i][j].equalsIgnoreCase("Lilin")) {
                        int hargabarang = 120000;
                    }
                    System.out.println("Barang yang anda pesan adalah : " + datajual[i][j]);
                }
            }
        }

    }
}
