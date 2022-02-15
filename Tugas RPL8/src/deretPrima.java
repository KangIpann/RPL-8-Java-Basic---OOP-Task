import javax.swing.JOptionPane;

public class deretPrima {
    public static void main(String[] args) {
        int range1, range2;
        int pembanding = 1;
        String input1, input2;
        input1 = JOptionPane.showInputDialog(null, "Masukan Minimal Angka");
        input2 = JOptionPane.showInputDialog(null, "Masukan Maksimal Angka");
        range1 = Integer.parseInt(input1);
        range2 = Integer.parseInt(input2);
        for (int a = range1; a <= range2; a++) {
            int deret = 0;
            for (pembanding = 1; pembanding <= a; pembanding++) {
                if (a % pembanding == 0) {
                    deret += 1;
                }
            }
            if (deret == 2) {
                System.out.println(a + ",");
            }

        }
    }
}
