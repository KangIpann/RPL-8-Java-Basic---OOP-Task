public class TokoOnline {
    public static void main(String[] args) {
        Laporan lapor = new Laporan();
        Transaksi tf = new Transaksi();
        Member mem = new Member();
        Barang brg = new Barang();

        lapor.laporan(brg);
        lapor.laporan(mem);
        lapor.laporan(tf, brg);

    }
}
