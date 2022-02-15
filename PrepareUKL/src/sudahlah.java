public class sudahlah {
    public static void main(String[] args) {
        int suku_pertama = 3, increment = 4, pembatas = 10, deretangka = 0, sukuke = 0;
        int matrix[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
        for (int j = 0; j < pembatas; j++) {
            for (int i = 0; i < pembatas; i++) {
                sukuke++;
                System.out.println("Nilai Pertama adalah = " + suku_pertama + " suku ke - " + sukuke);
                suku_pertama += increment;
                deretangka += suku_pertama;
                matrix[j][i] += suku_pertama;
            }
        }
        for (int j = 0; j < pembatas; j++) {
            for (int i = 0; i < pembatas; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Total deret aritmatika = " + deretangka);
    }
}
