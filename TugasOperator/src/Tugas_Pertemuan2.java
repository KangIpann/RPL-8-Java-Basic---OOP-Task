
import javax.swing.*;

public class Tugas_Pertemuan2 {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        double harga;
        harga = 4500.5;
        /* operator penugasan */
        String input = JOptionPane.showInputDialog("Masukan Jumlah Bunga Mawar Yang Dipesan: ");
        int mawar = Integer.parseInt(input);
        String input2 = JOptionPane.showInputDialog("Masukan Jumlah Bunga Melati Yang Dipesan: ");
        int melati = Integer.parseInt(input2);
        String input3 = JOptionPane.showInputDialog("Masukan Jumlah Bunga Matahari Yang Dipesan: ");
        int matahari = Integer.parseInt(input3);
        int total = mawar + melati + matahari;
        double bayar = total * harga;
        /* Operator Aritmatika */
        JOptionPane.showMessageDialog(null,
                "Jumlah yang dibeli = " + mawar + "+" + melati + "+" + matahari + "=" + total);
        JOptionPane.showMessageDialog(null, "Jumlah yang harus dibayar RP." + bayar);
        // Perbandingan
        if (mawar < melati && melati > matahari) {
            JOptionPane.showMessageDialog(null,
                    "Jumlah bunga melati yang dipesan lebih besar daripada bunga lain " + true);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Jumlah bunga melati yang dipesan lebih besar daripada bunga lain " + false);
        }

    }
}
