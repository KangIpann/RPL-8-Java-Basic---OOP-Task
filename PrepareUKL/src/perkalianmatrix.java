public class perkalianmatrix {
    public static void main(String[] args) {
        int a[][] = { { 6, 3, 2, 4, 2, 2 }, { 4, 6, 2, 1, 2, 3 }, { 1, 8, 3, 7, 1, 7 }, { 2, 6, 3, 6, 3, 9 } };
        int b[][] = { { 1, 2, 2, 7, 2 }, { 2, 3, 6, 9, 1 }, { 3, 9, 4, 1, 4 }, { 5, 1, 5, 3, 7 }, { 2, 6, 3, 7, 2 },
                { 9, 5, 3, 1, 4 } };
        int h[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };
        System.out.println("Hasil AxB");
        // proses perhitungan
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 6; k++) {
                    h[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        // menampilkan hasil
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(h[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
