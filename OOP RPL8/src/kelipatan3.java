import java.util.Scanner;

public class kelipatan3 {
    public static void main(String[] args) {
        kelipatanoop sistem = new kelipatanoop();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan absen kalian: ");
        int absen = input.nextInt();
        System.out.print("Kelipatan 3 : ");
        sistem.k3(absen);
    }

}
