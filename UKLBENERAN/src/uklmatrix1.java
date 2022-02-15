public class uklmatrix1 {
    public static void main(String[] args) {
        // Penjumlahan 4x6 + 4x6 = 4x6
        int penjumlahan1[][] = { { 1, 5, 2, 5 }, { 7, 3, 2, 3 }, { 4, 2, 3, 4 }, { 8, 4, 3, 4 } };
        int penjumlahan2[][] = { { 1, 2, 4, 1 }, { 6, 3, 7, 5 }, { 3, 4, 1, 5 }, { 3, 2, 6, 3 } };
        int hasil[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        int total = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                hasil[i][j] += penjumlahan1[i][j] + penjumlahan2[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                total += hasil[i][j];
            }

        }
        System.out.println("Total Angka Matrix = " + total);
    }
}
