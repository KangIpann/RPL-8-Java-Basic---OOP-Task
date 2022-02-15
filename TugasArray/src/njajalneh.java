import java.util.*;

public class njajalneh {
    public static void main(String[] args) {
        int a = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Value = ");
        a = input.nextInt();
        int array[][] = { { a, a, a, a }, { a, a, a, a }, { a, a, a, a }, { a, a, a, a } };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
