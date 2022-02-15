/**
 * uklno2
 */
public class uklno2 {

    public static void main(String[] args) {
        int increment = 4, tampil = 0, total = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tampil + "\t");
                tampil += increment;
                total += tampil;
            }
            System.out.println();
        }
        total -= tampil;
        System.out.println("Jumlah Total 6x4 = " + total);
    }
}