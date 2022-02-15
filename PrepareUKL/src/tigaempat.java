public class tigaempat {
    public static void main(String[] args) {
        int batas1 = 10;
        int batas2 = 10;
        int angka = 7;
        int total = 0;
        for (int i = 0; i < batas2; i++) {
            for (int j = 0; j < batas1; j++) {
                System.out.print(angka + "\t");
                angka += 5;
                total += angka;
            }
            System.out.println();
        }
        System.out.println("Total Deret Array = " + total);
    }
}
