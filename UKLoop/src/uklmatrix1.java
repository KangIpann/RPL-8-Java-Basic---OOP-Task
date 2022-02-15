
public class uklmatrix1 {
    public static void main(String[] args) {
        // Penjumlahan 4x6 + 4x6 = 4x6
        int penjumlahan1[][] = { { 1, 5, 2, 5 }, { 7, 3, 2, 3 }, { 4, 2, 3, 4 }, { 8, 4, 3, 4 } };
        int penjumlahan2[][] = { { 1, 2, 4, 1 }, { 6, 3, 7, 5 }, { 3, 4, 1, 5 }, { 3, 2, 6, 3 } };
        int hasil[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
        int total = 0;

        ukl1class matrix = new ukl1class();
        matrix.matrixawal(hasil, penjumlahan1, penjumlahan2);
        matrix.matrixakhir(hasil, penjumlahan1, penjumlahan2);
        total = matrix.total(hasil, total);
        System.out.println("Total Angka Matrix = " + total);
    }
}
