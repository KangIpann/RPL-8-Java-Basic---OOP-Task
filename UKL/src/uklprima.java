import javax.swing.*;

public class uklprima {
    public static int prima(int a, int b, int i) {
        String tampil;
        for (i = a; i <= b; i++) {
            int deret = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    deret += 1;
                }
            }
            if (deret == 2) {
                JOptionPane.showMessageDialog(null, i + " ,");
            }
        }
        return i;

    }

    public static void main(String[] args) {
        String input;
        int a = 0, b = 0, i = a;
        JOptionPane.showMessageDialog(null, "Selamat Datang Di Program Deret Prima");
        input = JOptionPane.showInputDialog(null, "Masukan Angka Minimum");
        a = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Masukan Angka Maksimum");
        b = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, " " + prima(a, b, i));
    }
}
