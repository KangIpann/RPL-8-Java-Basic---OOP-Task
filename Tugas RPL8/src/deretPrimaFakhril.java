import javax.swing.JOptionPane;

public class deretPrimaFakhril {
    public static void main(String[] args) {

        //Bilangan prima adalah bilangan yang hanya memiliki 2 faktor yaitu 1 dan bilangan itu sendiri

        JOptionPane.showMessageDialog(null,"Selamat Datang di Program Pengecekan Bilangan Prima");

        String input1 = JOptionPane.showInputDialog(null,"Masukkan range awal");
        int rangeAwal = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog(null,"Masukkan range akhir");
        int rangeAkhir = Integer.parseInt(input2);

        for (int a = rangeAwal ; a <= rangeAkhir ; a++){
            int jumlahFaktor = 0;

            for (int pembanding = 1 ; pembanding <= a ; pembanding++){
                if (a % pembanding == 0){
                    jumlahFaktor += 1 ;
                }
            } if (jumlahFaktor == 2){
                System.out.println("Bilangan prima di dalam range tersebut adalah " + a);
            }
        }

    }
}