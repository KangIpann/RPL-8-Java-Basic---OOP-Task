public class uklno3b {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int u = a;
        int s = a;
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(u + "\t");
                u = u + b;
                s = s + u;
            }
            System.out.println();
        }
        s = s - u;
        System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
    }
}
