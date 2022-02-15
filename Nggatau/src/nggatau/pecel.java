import javax.swing.*;

public class pecel {
    public static void main(String[] args) {
        // memBUAT LOPE LOPE
        String love;
        int love1;
        int konfirmasi;
        // mengambil input
        love = JOptionPane.showInputDialog("what percentage do you love me? :");
        love1 = Integer.parseInt(love);
        konfirmasi = JOptionPane.showConfirmDialog(null, "UMM REALLY?");
        // cek apakah dia betul lop atau tidak
        if (love1 >= 1) {
            JOptionPane.showMessageDialog(null, "THANKYOU");
        }

        System.out.println("I LOVE YOU ...");

    }
}
