import java.util.*;

import javax.swing.JOptionPane;

public class bintang {
    public static void main(String[] args) {
        String input;
        int tinggi;
        input = JOptionPane.showInputDialog("Masukan Batas");
        tinggi = Integer.parseInt(input);
        for (int a = 10; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print("C" + " ");
            }
            System.out.println();
        }
        // for (int a = 1; a <= 10; a++) {
        // for (int b = 1; b <= a; b++) {
        // System.out.print("C" + " ");
        // }
        // System.out.println();
        // }
        // for (int a = 1; a <= tinggi; a++) {
        // for (int b = 1; b <= a; b++) {
        // System.out.print("C" + " ");
        // }
        // System.out.println();
        // }
    }
}