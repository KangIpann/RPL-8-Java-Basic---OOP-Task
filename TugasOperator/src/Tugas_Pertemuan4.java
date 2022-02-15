public class Tugas_Pertemuan4 {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        System.out.println("nilai a=" + a);
        System.out.println("nilai b=" + b);

        ++a;
        b++;
        System.out.println("nilai a kedua=" + a);
        System.out.println("nilai b kedua=" + b);

        int hasilA = a;
        int hasilB = b;
        System.out.println("nilai hasilA=" + hasilA);
        System.out.println("nilai hasilB=" + hasilB);

        hasilA = a += 2;
        hasilB = b -= 2;
        System.out.println("nilai a ketiga=" + a);
        System.out.println("nilai b ketiga=" + b);
        System.out.println("nilai hasilA kedua=" + hasilA);
        System.out.println("nilai hasilB kedua=" + hasilB);
    }
}