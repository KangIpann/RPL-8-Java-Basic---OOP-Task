public class Anak extends Ayah {
    double nilaimax = 99.99;
    String nama = "Dina";
    int age = 17;

    public void Cetak() {
        System.out.println("Anak ini memiliki sifat " + super.Sifat);
        System.out.println("yang bernama " + nama);
        System.out.println("Berumur " + age + " tahun");
        System.out.println("Dengan tinggi badan " + super.TB);
    }

    public static void main(String[] args) {
        Anak dina = new Anak();
        dina.Cetak();
    }
}
