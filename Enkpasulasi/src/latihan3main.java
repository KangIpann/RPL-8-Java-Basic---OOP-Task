
public class latihan3main {
    public static void main(String[] args) {
        latihan3class siswa = new latihan3class();
        siswa.setName("Agus");
        siswa.setAge(20);
        siswa.setAddress("Malang");

        System.out.println(
                "Nama: " + siswa.getName() + " alamat " + siswa.getAddress() + " berumur " + siswa.getAge() + " tahun");
    }
}
