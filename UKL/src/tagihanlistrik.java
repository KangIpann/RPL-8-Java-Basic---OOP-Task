import java.util.Scanner;

public class tagihanlistrik {
    public static int tarif(int golongan, int jumlah) {
        int hasil = 0;
        if (golongan == 1) {
            hasil = jumlah * 1000;
        } else if (golongan == 2) {
            hasil = jumlah * 1300;
        } else {
            hasil = jumlah * 1500;
        }
        return hasil;

    }

    public static void main(String[] args) {
        int golongan = 0;
        String data[][] = { { "", "", "", "" }, { "1", "Galuh", "1", "Sawojajar" }, { "2", "Indro", "3", "Sawojajar" },
                { "3", "Jedi", "2", "Sawojajar" }, { "4", "Kanu", "3", "Sawojajar" } };
        Scanner input = new Scanner(System.in);
        System.out.print("ID Pelanggan = ");
        int id = input.nextInt();
        System.out.print("Jumlah Pemakaian (KWH) = ");
        int jumlah = input.nextInt();

        if (id < 1 || id > data.length) {
            System.out.println("ID Pelanggan Tidak ada");
        } else {
            golongan = Integer.parseInt(data[id][2]);
        }
        int bayar = tarif(golongan, jumlah);
        if (bayar < 50000) {
            bayar = 50000;
        }
        int total = bayar + 130000;

        System.out.println("ID Pelanggan : " + data[id][0] + "");
        System.out.println("Nama Pelanggan : " + data[id][1] + "");
        System.out.println("Jumlah Tagihan : RP." + total + "");
        System.out.println("Golongan Pelanggan : " + data[id][2] + "");
        System.out.println("Alamat : " + data[id][3] + "");
    }
}
