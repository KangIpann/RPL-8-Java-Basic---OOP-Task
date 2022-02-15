public class Matrix {
    public static void main(String[] args) {
        int absen[][] = { { 7, 7, 7 }, { 7, 7, 7 }, { 7, 7, 7 } };
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.print(absen[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");
        int angka[][] = { { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 } };
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.print(angka[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");
        int matriks3[][] = new int[3][3];
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                matriks3[a][b] = absen[a][b] - angka[a][b];
                System.out.print(matriks3[a][b] + " ");
            }
            System.out.println();
        }
    }
}
