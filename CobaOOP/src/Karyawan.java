import java.util.ArrayList;

public class Karyawan implements user {
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Karyawan() {
        this.namaKaryawan.add("Admins");
        this.alamat.add("Kedungkandang");
        this.telepon.add("012830217678");
        this.jabatan.add(0);
    }

    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);
    }

    public int getJabatan(int id) {
        return this.jabatan.get(id);
    }

    public int getJmlKaryawan() {
        return this.namaKaryawan.size();
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);

    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);

    }

    @Override
    public void setNama(String nama) {
        this.namaKaryawan.add(nama);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
}
