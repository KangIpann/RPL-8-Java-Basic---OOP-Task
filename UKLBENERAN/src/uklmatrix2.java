public class uklmatrix2 {
    public static void main(String[] args) {

        int total = 0;
        int pertama[][] = { { 6, 3, 2, 4, 2, 2 }, { 4, 6, 2, 1, 2, 3 }, { 1, 8, 3, 7, 1, 7 }, { 2, 6, 3, 6, 3, 9 },
                { 1, 8, 6, 7, 1, 2 } };
        int kedua[][] = { { 1, 2, 2, 7, 2 }, { 2, 3, 6, 9, 1 }, { 3, 9, 4, 1, 4 }, { 5, 1, 5, 3, 7 }, { 2, 6, 3, 7, 2 },
                { 9, 5, 3, 1, 4 } };
        int hasil[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 } };
        System.out.println("Hasil AxB");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 6; k++) {
                    hasil[i][j] += pertama[i][k] * kedua[k][j];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                total += hasil[i][j];
            }
        }
        System.out.println("Total Angka Matrix = " + total);
    }
}
