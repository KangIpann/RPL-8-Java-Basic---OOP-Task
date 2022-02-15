public class App {

    private int penumpang, maxpenumpang;

    public App(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    public void pluspenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxpenumpang) {
            System.out.println("Overload penumpang");

        } else {
            this.penumpang = temp;
        }

    }

    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("Penumpang seharusnya adalah = " + maxpenumpang);
    }
}