public class praktikum1main {
    public static void main(String[] args) {
        praktikum1class pe = new praktikum1class();
        pe.addBeratPenumpang(59.3);
        pe.addBeratPenumpang(60.4);
        pe.addBeratPenumpang(70.0);
        pe.addBeratPenumpang(43.0);
        pe.addBeratPenumpang(77.3);
        pe.addBeratPenumpang(32.2);
        pe.addBeratPenumpang(90.3);

        // System.out.println("Berat rata rata penumpang bus adalah : " +
        // pe.getAverage());
        System.out.println(pe.addBeratPenumpang(0));
    }
}
