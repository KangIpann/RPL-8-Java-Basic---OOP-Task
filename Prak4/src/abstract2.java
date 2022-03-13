public class abstract2 extends abstract1 {

    @Override
    public void walk() {
        System.out.println("Aeroplane Flying");
    }

    public static void main(String[] args) {

        abstract2 garuda = new abstract2();
        garuda.function();
        garuda.fuel();
        garuda.walk();

    }
}