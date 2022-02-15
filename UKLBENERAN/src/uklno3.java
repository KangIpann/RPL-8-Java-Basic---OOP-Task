/**
 * uklno3
 */
public class uklno3 {

    public static void main(String[] args) {

        int tinggi = 8;
        int increment = 5;
        int tampil = tinggi;
        int totalderet = 0;
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(tampil + "\t");
                tampil += increment;
                totalderet += tampil;
            }
            System.out.println();
        }
        System.out.println("Jumlah Deret Aritmatikanya adalah " + totalderet);
    }
}