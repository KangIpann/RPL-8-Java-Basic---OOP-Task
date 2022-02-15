import javax.swing.JOptionPane;

public class angkatambah {
    public static void main(String[] args) {
        String input;
        int b;
        input = JOptionPane.showInputDialog("Masukan Angka Batas");
        b = Integer.parseInt(input);
        for (int a = 1; a <= b; a++) {
            System.out.println(a);

            b *= a;
        }
        System.out.println("Total Nya adalah = " + b);
    }
}