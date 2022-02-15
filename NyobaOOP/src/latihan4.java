package src;

import java.util.Scanner;

public class latihan4 {
    private int penumpang, maxpenumpang;

    public latihan4(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    public void pluspenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxpenumpang) {
            System.out.println("Overload penumpang");
        } else {
            this.penumpang = temp;
        }
    }

    public void getPassword(int password) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Password: ");
        password = input.nextInt();
        if (password == 90) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Pass Salah");
        }
    }

    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("Penumpang seharusnya adalah = " + maxpenumpang);
    }
}
