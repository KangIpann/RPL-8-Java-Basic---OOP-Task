import java.util.*;

public class objeksegitiga {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan alas segitiga : ");
        int luas = input.nextInt();
        System.out.print("Masukan tinggi segitiga : ");
        int tinggi = input.nextInt();
        segitiga s = new segitiga();
        s.luasSegitiga(luas, tinggi);
        
    }
}
