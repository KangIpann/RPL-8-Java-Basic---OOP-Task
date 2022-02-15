import javax.swing.JOptionPane;

public class Prima {
    public static void main(String[] args) {
        String input;
        int prima, cek = 0;
        int minus = 0 - 3;
        input = JOptionPane.showInputDialog("Masukan Bilangan");
        prima = Integer.parseInt(input);

        for (int i = 2; i <= prima; i++) {
            System.out.println("Pembagi = " + i);
            if (prima % i == 0) {
                cek++;
                System.out.println(cek);
            }
        }

        if (cek == 1) {
            System.out.println(prima + " adalah bilangan prima");
        } else if (prima <= 2 && prima > minus) {
            System.out.println(prima + " adalah bilangan prima");
        } else {
            System.out.println(prima + " bukan bilangan prima");
        }
    }
}
