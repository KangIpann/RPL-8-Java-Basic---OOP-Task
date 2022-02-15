import javax.swing.*;

public class uklgg {
    public static void genap(int angk1, int angk2) {
        System.out.println("Deretan angka genap :");
        for (int i = angk1 + 1; i < angk2; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
    }

    public static void ganjil(int angk1, int angk2) {
        System.out.println("Deretan angka ganjil :");
        for (int i = 0; i < angk2; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
    }

    public static void main(String[] args) {
        int angk1 = 0, angk2 = 0, ganjil = 0, genap = 0, konfirmasi = 0;
        String input;

        JOptionPane.showMessageDialog(null, "Selamat Datang Di Program Mencari Ganjil Genap");
        konfirmasi = JOptionPane.showConfirmDialog(null,
                "Apakah yang ingin kamu cari?\n" + "Yes = Genap \n" + "No = Ganjil\n" + "Cancel = Keluar Program");
        if (konfirmasi == 0) {
            input = JOptionPane.showInputDialog(null, "Masukan Angka Minimum");
            angk1 = Integer.parseInt(input);
            input = JOptionPane.showInputDialog(null, "Masukan Angka Maksimum");
            angk2 = Integer.parseInt(input);
            genap(angk1, angk2);

        } else if (konfirmasi == 1) {
            input = JOptionPane.showInputDialog(null, "Masukan Angka Minimum");
            angk1 = Integer.parseInt(input);
            input = JOptionPane.showInputDialog(null, "Masukan Angka Maksimum");
            angk2 = Integer.parseInt(input);
            ganjil(angk1, angk2);
        }
    }
}
