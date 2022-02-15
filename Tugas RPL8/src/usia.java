import javax.swing.*;
public class usia {
    public static void main(String[] args) {
        String konfirmasi;
        while (true) {
            String input = JOptionPane.showInputDialog("Masukan Usia");
            int usia = Integer.parseInt(input);
            if (usia >= 0 && usia <= 5) {
                JOptionPane.showMessageDialog(null, "Usia anda termasuk Balita", "Kategori Usia", JOptionPane.INFORMATION_MESSAGE);

            } else if (usia >= 5 && usia <= 10) {
                JOptionPane.showMessageDialog(null, "Usia anda termasuk Balita", "Kategori Usia", JOptionPane.INFORMATION_MESSAGE);
            }else if (usia >= 6 && usia <= 11) {
                JOptionPane.showMessageDialog(null, "Usia anda termasuk Balita", "Kategori Usia", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (usia >= 12 && usia <= 16) {
                JOptionPane.showMessageDialog(null, "Usia anda termasuk Balita", "Kategori Usia", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (usia >= 17 && usia <= 25) {
                JOptionPane.showMessageDialog(null, "Usia anda termasuk Balita", "Kategori Usia", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (usia >= 26 && usia <= 35) {
                JOptionPane.showMessageDialog(null, "Usia anda termasuk Balita", "Kategori Usia", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (usia >= 36 && usia <= 45) {
                JOptionPane.showMessageDialog(null, "Usia anda termasuk Balita", "Kategori Usia", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (usia >= 46 && usia <= 55) {
                JOptionPane.showMessageDialog(null, "Usia anda termasuk Balita", "Kategori Usia", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (usia >= 56 && usia <= 65) {
                JOptionPane.showMessageDialog(null, "Usia anda termasuk Balita", "Kategori Usia", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (usia >= 65) {
                JOptionPane.showMessageDialog(null, "Usia anda termasuk Balita", "Kategori Usia", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
