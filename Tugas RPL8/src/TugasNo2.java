import javax.swing.JOptionPane;

public class TugasNo2 {
    public static void main(String[] args) {
        String input;
        int lalulintas;

        JOptionPane.showMessageDialog(null,"Selamat Datang Di Program Lalu Lintas!","Selamat Datang",JOptionPane.INFORMATION_MESSAGE);
       input = JOptionPane.showInputDialog("Masukan Input Untuk Menyalakan Lampu Lalu Lintas: \n" + "1 = Berhenti \n" + "2 = Siap Siap Jalan/Berhenti \n" +"3 = Berjalan\n");
       lalulintas = Integer.parseInt(input);
       switch (lalulintas){
           case 1:
               JOptionPane.showMessageDialog(null,"Lampu Berwarna Merah atau Berhenti.","Berhenti!", JOptionPane.ERROR_MESSAGE);
               break;
           case 2:
               JOptionPane.showMessageDialog(null,"Lampu Berwarna Kuning atau Siap Siap Jalan.","Siap Siap Jalan!", JOptionPane.WARNING_MESSAGE);
            break;
           case 3:
               JOptionPane.showMessageDialog(null,"Lampu Berwarna Hijau atau Jalan.","Jalan!", JOptionPane.INFORMATION_MESSAGE);
            break;
       }
    }
}
