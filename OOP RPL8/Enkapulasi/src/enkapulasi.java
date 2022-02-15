import java.util.Scanner;

public class enkapulasi {
    public String namaSiswa;
    private int usia;
    protected String alamat = "Malang";
    Scanner input = new Scanner(System.in);

    public void cetakBiodata() {
        enkapulasi el = new enkapulasi();

        System.out.println("Nama : " + el.namaSiswa);
        System.out.println("Alamat: " + el.alamat);

    }

    final int usia() {
        enkapulasi el = new enkapulasi();
        return el.usia = 15;
    }
}