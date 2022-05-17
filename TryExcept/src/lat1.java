import java.util.Scanner;

public class lat1 {
    public static void main(String[] args) throws Exception{
        int a=100;
        System.out.println("Enter the value for b");
        Scanner console = new Scanner(System.in);
         int b = console.nextInt();

        System.out.println("Enter the value for c");

        // Exception Handling
        try {
            int c = console.nextInt();
            int res=c/0;
            int mbuh = 10/(b-c);
            System.out.println(" The result is "+res);
        }
        catch (Exception exception_message){
            System.out.println("Angka yang anda masukan sebenernya ngga guna sih. Lawong ini dibagi 0 semua. Gapercaya? Nih + " +exception_message);
        }
    }

}
