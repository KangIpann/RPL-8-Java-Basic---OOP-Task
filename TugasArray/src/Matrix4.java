import javax.swing.*;

public class Matrix4 {
    public static void main(String[] args) {
        String input, input2;
        int l, p = 0;
        int Matrix4[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
        for (int i = 0; i < Matrix4.length; i++) {
            for (int j = 0; j <= Matrix4.length; j++) {
                System.out.print(Matrix4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
