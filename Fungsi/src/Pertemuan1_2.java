import java.util.*;

public class Pertemuan1_2 {
    public static void hitung(int a, int b) {
        System.out.println((a + b));

    }

    public static void ucapan() {
        System.out.println("nilai a dan b adalah");
    }

    public static int max(int a, int b, int c) {
        int maks;
        System.out.print("nilai tertinggi :");
        maks = Math.max(a, b);
        if (c > maks) {
            maks = c;
        }
        System.out.println(maks);
        return maks;

    }

    public static void main(String[] args) {
        ucapan();
        hitung(10, 2);
        System.out.println("======================================");
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Masukan nilai a : ");
        a = input.nextInt();

        System.out.print("Masukan nilai b : ");
        b = input.nextInt();

        System.out.print("Masukan nilai c: ");
        c = input.nextInt();

        max(a, b, c);

    }
}
