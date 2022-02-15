public class ukl1class {
    int penjumlahan1[][];
    int penjumlahan2[][];
    int hasil[][];
    int total;

    public void matrixawal(int hasil[][], int penjumlahan1[][], int penjumlahan2[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                hasil[i][j] += penjumlahan1[i][j] + penjumlahan2[i][j];
            }
        }
    }

    public void matrixakhir(int hasil[][], int penjumlahan1[][], int penjumlahan2[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int total(int hasil[][], int total) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                total += hasil[i][j];
            }

        }
        return total;
    }
}
