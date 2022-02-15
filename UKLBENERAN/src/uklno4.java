public class uklno4 {
    public static void main(String[] args) {
        int increment = 3;
        int tampil = 5;
        int total = 5;
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j <= 8 - i; j++) {
                System.out.print(tampil + "\t");
                tampil += increment;
                total += tampil;
            }
            System.out.println();
        }
        for (int i = 2; i <= 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(tampil + "\t");
                tampil += increment;
                total += tampil;
            }
            System.out.println();
        }
        total -= tampil;
        System.out.println("Jumlah Deret Aritmatikanya adalah " + total);
    }
}
