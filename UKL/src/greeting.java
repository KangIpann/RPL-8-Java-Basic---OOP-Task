import javax.swing.JOptionPane;

public class greeting {
    public static int ganjilgenap(int a) {
        if (a % 2 == 0) {
            JOptionPane.showMessageDialog(null, a + " Adalah bilangan Genap");
        } else {
            JOptionPane.showMessageDialog(null, a + " Adalah bilangan Ganjil");
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 0;
        String input, input2;
        input = JOptionPane.showInputDialog(null, "Nama: ");
        input2 = JOptionPane.showInputDialog(null, "No Absen: ");
        a = Integer.parseInt(input2);
        JOptionPane.showMessageDialog(null, "Selamat Pagi " + input);
        ganjilgenap(a);
    }
}
