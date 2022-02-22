public class Anak2 extends Ayah2 {
    double nilaimax = 99.99;
    String nama = "Dina";
    int age = 17;

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void Cetak() {
        System.out.println("Anak ini memiliki sifat " + super.Sifat);
        System.out.println("yang bernama " + nama);
        System.out.println("Berumur " + age + " tahun");
        System.out.println("Dengan tinggi badan " + super.TB);
    }

    public static void main(String[] args) {
        Anak2 dina = new Anak2();
        dina.setnama("Dinaaa");
        dina.Cetak();
    }
}
