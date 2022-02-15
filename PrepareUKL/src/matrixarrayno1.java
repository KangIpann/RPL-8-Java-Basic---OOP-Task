public class matrixarrayno1 {
    public static void main(String[] args) {
        int a[][] = { { 1, 5, 2, 5, 4, 2 }, { 7, 3, 2, 3, 6, 3 }, { 4, 2, 3, 4, 1, 6 }, { 8, 4, 3, 4, 3, 2 } };
        int b[][] = { { 1, 2, 4, 1, 3, 7 }, { 6, 3, 7, 5, 3, 5 }, { 3, 4, 1, 5, 7, 3 }, { 3, 2, 6, 3, 3, 7 } };
        int c[][] = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                c[i][j] += a[i][j] + b[i][j];
            }
        }
        // menampilkan hasil
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
