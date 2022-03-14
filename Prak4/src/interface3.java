public class interface3 {

    public static void main(String[] args) {
        interface2 coba = new interface2(2.5, 3, 4, 5);
        interface2 pertama = new interface2(3, 4, 5, 6);
        coba.getLength();
        coba.isGreater(coba, pertama);
        System.out.println(coba.isGreater(coba, pertama));
    }
}
