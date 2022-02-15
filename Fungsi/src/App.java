import javax.swing.*;

public class App {
    public static int luas1(int lebar, int panjang) {
        int luas;
        luas = panjang * lebar;
        return luas;
    }

    public static void main(String[] args) {
        String input;
        int hasil = 0;
        int lebar, panjang;
        input = JOptionPane.showInputDialog("Masukan Lebar");
        lebar = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Masukan Panjang");
        panjang = Integer.parseInt(input);
        hasil = luas1(lebar, panjang);
        JOptionPane.showMessageDialog(null, "Luas Persegi panjang adalah " + hasil + "Cm");
    }
}
