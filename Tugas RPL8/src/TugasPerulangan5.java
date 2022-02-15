import javax.swing.JOptionPane;

public class TugasPerulangan5 {
    public static void main(String[] args) {
        String input;
        String nama;
        nama = JOptionPane.showInputDialog("Masukan Nama Anda");
        input = JOptionPane.showInputDialog("Masukan Absen Anda");
        int a = Integer.parseInt(input);
        for ( int b = 1; b <= a; b++ ){
            JOptionPane.showMessageDialog(null, "Nama Anda Adalah = " + nama + "Absen Ke -" + input);
            System.out.println(b +
                    ". " +
                    "Nama Anda Adalah = " + nama + "Absen Ke -" + input);
        }
    }
}
