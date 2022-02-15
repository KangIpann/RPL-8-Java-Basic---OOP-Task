import javax.swing.*;

public class cobacoba {
    public static void main(String[] args) {

        String input, input2;
        int l = 0, p = 0;
        input = JOptionPane.showInputDialog("Masukan Lebar Dimensi");
        input2 = JOptionPane.showInputDialog("Masukan Panjang Dimensi");
        l = Integer.parseInt(input);
        p = Integer.parseInt(input);
        int anu[][] = new int[l][p];
        for (int lebar = 0; lebar < l; lebar++) {
            for (int panjang = 0; panjang < p; panjang++) {
                int mbuh[][] = { { lebar }, { panjang } };
                anu[l][p] = mbuh[lebar][panjang];
                System.out.print(anu[lebar][panjang]);
                System.out.println();
            }
        }
    }
}
// int yntkts[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0,
// 0 } };
// int loop[][] = new int[l][p];
// for (int i = 0; i < yntkts.length; i++) {
// for (int j = 0; j < yntkts.length; j++) {
// loop[l][p] = yntkts[i][j];
// }
// }