public class persegipanjang extends bangundatar {
    float panjang, lebar;

    public void luas() {
        float luas = panjang * lebar;
        System.out.println("Luas persegi panjang = " + luas);
    }

    public void keliling() {
        float keliling = 2 * (panjang * lebar);
        System.out.println("Keliling persegi panjang = " + keliling);
    }
}
