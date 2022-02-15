import javax.swing.JOptionPane;

public class ngetest {
    public static void main(String[] args) {
        String input;
        int angka;
        input = JOptionPane.showInputDialog("Masukan Angka Batas");
        angka = Integer.parseInt(input);
        for (int a = 1; a <= angka; a++) {
            for (int b = a; b <= angka; b++) {
                System.out.print(" ");
            }

            for (int c = 0; c <= (a * 2) - 2; c++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
