import java.util.ArrayList;
import java.util.Scanner;

public class banding {
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idMember = new ArrayList<Integer>();

    public banding() {
        this.idMember.add(0);
        this.idBarang.add(2);
        this.banyak.add(2);

        this.idMember.add(0);
        this.idBarang.add(1);
        this.banyak.add(3);

        this.idMember.add(1);
        this.idBarang.add(0);
        this.banyak.add(1);

        this.idMember.add(1);
        this.idBarang.add(2);
        this.banyak.add(2);

    }

    public int getIdBarang (int id){
        return this.idBarang.get(id);
    }
    public int getBanyaknya (int id){
        return this.banyak.get(id);
    }
    public int getIdMember (int id){
        return this.idMember.get(id);
    }
    public int getJmlTransaksi (){
        return this.idMember.size();
    }

    public void setTransaksi (Barang barang, int idMember, int idBarang,int banyaknya){
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.banyak.add(banyaknya);
        barang.editStok(idBarang,barang.getStok(idBarang)-banyaknya);
    }

    public void prosesTransaksi(Member member, Transaksi transaksi, Barang barang) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nSilakan belanja");
        System.out.println("Masukkan ID Member");
        int idMember = in.nextInt();
        System.out.println("Selamat datang " + member.getNama(idMember-1));
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;

        do {
            System.out.println("Masukkan kode barang :");
            temp = in.nextInt();
            if (temp != 99) {
                idBarang.add(temp);
                System.out.println(barang.getNamaBarang(idBarang.get(i)) + " sebanyak : ");
                banyak.add(in.nextInt());
                i++;
            }
        } while (temp != 99);

        System.out.println("Transaksi belanja "+member.getNama(idMember)+ " sebagai berikut");
        System.out.println("Nama Barang \tQty \tharga \tJumah \t");

        int total = 0;
        int x = idBarang.size();
        for (int j=0 ; j<x ; j++){
            int jumlah=banyak.get(j) * barang.getHarga(idBarang.get(j));
            total+=jumlah;
            System.out.println(barang.getNamaBarang(idBarang.get(j))+"\t\t"+
                    banyak.get(j)+"\t"+
                    barang.getHarga(idBarang.get(j))+"\t"+
                    jumlah);
            transaksi.setTransaksi(barang, idMember, idBarang.get(j),banyak.get(j));
        }

        System.out.println("Total Belanja : "+total);
        member.editSaldo(idMember,member.getSaldo(idMember)-total);
    }



}
