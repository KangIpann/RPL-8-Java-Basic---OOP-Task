// import java.util.Scanner;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

// public class Nyoba {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int a;

//         System.out.print("Masukan bilangan = ");
//         a = input.nextInt();

//         if (a % 2 == 0) {
//             System.out.println("Genap");
//         } else {
//             System.out.println("Ganjil");
//         }
//     }
// }

import java.util.Scanner;

public class Nyoba {
    public static void main(String[] args) {
        Scanner TipeData = new Scanner(System.in);
        int x, y, hasilsegitiga, umur, absen;
        double hasillingkaran1, hasillingkaran2;

        System.out.print("Masukkan nilai x : ");
        x = TipeData.nextInt();
        System.out.print("Masukkan nilai y : ");
        y = TipeData.nextInt();
        System.out.print("Masukkan absen kelas : ");
        absen = TipeData.nextInt();
        System.out.print("Masukkan nama anda : ");
        String nama = TipeData.next();
        System.out.print("Masukkan umur anda : ");
        umur = TipeData.nextInt();
        System.out.print("Apa hobi anda : ");
        String hobi = TipeData.next();
        System.out.print("Masukkan kelas anda : ");
        String kelas = TipeData.next();

        hasilsegitiga = x * y / 2;
        System.out.println("Luas segitiga = " + hasilsegitiga);
        hasillingkaran1 = 3.14 * x * x;
        System.out.println("Luas lingkaran dengan jari2 x = " + hasillingkaran1);
        hasillingkaran2 = 3.14 * y * y;
        System.out.println("Luas lingkaran dengan jari2 y = " + hasillingkaran2);

        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("No. Absen : " + absen);
        System.out.println("Umur : " + umur);
        System.out.println("Hobi : " + hobi);
    }
}
