import javax.swing.*;

public class uklcadangan {
    public static void prima(int a, int b) {
        for (int i = a; i <= b; i++) {
            int deret = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    deret += 1;
                }
            }
            if (deret == 2) {
                System.out.print(i + ",");
            }
        }
    }

    public static void main(String[] args) {
        String input;
        int a = 0, b = 0;
        JOptionPane.showMessageDialog(null, "Selamat Datang Di Program Deret Prima");
        input = JOptionPane.showInputDialog(null, "Masukan Angka Minimum");
        a = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Masukan Angka Maksimum");
        b = Integer.parseInt(input);
        prima(a, b);
    }
}
