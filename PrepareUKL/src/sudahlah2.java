import java.util.Random;

public class sudahlah2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + "\t");
                total += j;
            }
            System.out.println();
        }
        System.out.println("Total Matrix adalah = " + total);
    }
}
