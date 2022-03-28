public class bangundatar implements relasi {
    private int panjang;
    private int lebar;

    public bangundatar(int p, int l) {
        this.panjang = p;
        this.lebar = l;
    }

    public int getLuas() {
        int luas = panjang * lebar;
        return luas;
    }

    @Override
    public boolean cek(Object PersegiA, Object PersegiB) {
        int luas1 = ((bangundatar) PersegiA).getLuas();
        int luas2 = ((bangundatar) PersegiB).getLuas();

        return (luas1 > luas2);
    }

    public static void main(String[] args) {
        bangundatar persegi1 = new bangundatar(10, 9);
        bangundatar persegi2 = new bangundatar(5, 10);
        System.out.println(persegi1.getLuas());
        System.out.println(persegi2.getLuas());
        System.out.println(persegi1.cek(persegi1, persegi2));
    }
}
