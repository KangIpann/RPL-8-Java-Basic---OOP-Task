public class ujibus {
    public static void main(String[] args) {
        Bus busMini = new Bus(10);
        busMini.cetak();
        busMini.pluspenumpang(3);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

    }
}
