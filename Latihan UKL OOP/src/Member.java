import java.util.ArrayList;

public class Member implements user {
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Member() {
        this.namaMember.add("Ivan");
        this.alamat.add("Jl Danau Poso 1");
        this.telepon.add("085155225890");
        this.saldo.add(10000000);

        this.namaMember.add("Supri");
        this.alamat.add("Jl Danau Poso 2");
        this.telepon.add("085155225891");
        this.saldo.add(20000000);

        this.namaMember.add("Sulis");
        this.alamat.add("Jl Danau Poso 3");
        this.telepon.add("085155225892");
        this.saldo.add(30000000);

    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idMember) {
        return this.saldo.get(idMember);
    }

    public void editSaldo(int idMember, int saldo) {
        this.saldo.set(idMember, saldo);
    }

    public int getJmlMember() {
        return this.saldo.size();
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);

    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);

    }

    @Override
    public void setNama(String nama) {
        this.namaMember.add(nama);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
}