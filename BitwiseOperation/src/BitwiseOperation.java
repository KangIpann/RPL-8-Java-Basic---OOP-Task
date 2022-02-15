import java.util.Scanner;

public class BitwiseOperation {
    public static void main(String[] args) {
        // Variabel Bitwise true&false
        // Variabel 1=True 0=False
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        // Variabel integer desimal
        int c;
        int d;
        // Variabel hasil
        int hasilBiner;
        int hasilDesimal;
        // List Nilai Variabel
        System.out.printf("List Variabel:\n");
        System.out.printf("Masukan Angka Biner 0 dan 1\n");
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.printf("Masukan angka desimal di C dan D\n");
        System.out.print("c = ");
        c = input.nextInt();
        System.out.print("d = ");
        d = input.nextInt();

        // Variabel implementasi biner
        System.out.println("Dibawah ini adalah hasil dari Implementasi Biner. Dimana 0 = False dan 1 = True");
        // Bitwise AND
        hasilBiner = a & b;
        System.out.println("Hasil Biner dari a & b : " + hasilBiner);
        // Bitwise OR
        hasilBiner = a | b;
        System.out.println("Hasil Biner dari a | b : " + hasilBiner);
        // Bitwise XOR
        hasilBiner = a ^ b;
        System.out.println("Hasil Biner dari a ^ b : " + hasilBiner);
        // Bitwise NOT
        hasilBiner = ~a;
        System.out.println("Hasil Biner dari ~a : " + hasilBiner);
        // Bitwise Left Shift
        hasilBiner = a << 1;
        System.out.println("Hasil Biner dari a << 1 : " + hasilBiner);
        // Bitwise Right Shift
        hasilBiner = a >> 1;
        System.out.println("Hasil Biner dari a >> 1 : " + hasilBiner);

        // Variabel implementasi desimal
        System.out.println("Dibawah ini adalah hasil dari Implementasi Desimal.");
        // Bitwise AND
        hasilDesimal = c & d;
        System.out.println("Hasil desimal dari c & d : " + hasilDesimal);
        // Bitwise OR
        hasilDesimal = c | d;
        System.out.println("Hasil desimal dari c | d : " + hasilDesimal);
        // Bitwise XOR
        hasilDesimal = c ^ d;
        System.out.println("Hasil desimal dari c ^ d : " + hasilDesimal);
        // Bitwise NOT
        hasilDesimal = ~d;
        System.out.println("Hasil desimal dari ~d : " + hasilDesimal);
        // Bitwise Left Shift
        hasilDesimal = d << 1;
        System.out.println("Hasil desimal dari d << 1 : " + hasilDesimal);
        // Bitwise Right Shift
        hasilDesimal = d >> 1;
        System.out.println("Hasil desimal dari d >> 1 : " + hasilDesimal);
    }
}
