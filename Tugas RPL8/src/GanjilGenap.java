import javax.swing.*;
public class GanjilGenap {
    public static void main(String[] args) {
    while(true){
        String input = JOptionPane.showInputDialog("Masukan Angka! ");
        int angka = Integer.parseInt(input);
        int konfirmasi;
        if(angka % 2 == 0){
            JOptionPane.showMessageDialog(null,"Bilangan Genap");
            konfirmasi = JOptionPane.showConfirmDialog(null,"Ingin input ulang?");
            if (konfirmasi == 0){
                JOptionPane.showMessageDialog(null, "Menjalankan Ulang Program!","Pesan Peringatan",JOptionPane.WARNING_MESSAGE);
                continue;
            } else if(konfirmasi == 1){
                break;
            } else if(konfirmasi == 2) {
                break;
            }
        }else {
            JOptionPane.showMessageDialog(null, "Bilangan Ganjil");
            konfirmasi = JOptionPane.showConfirmDialog(null,"Ingin input ulang?");
            if (konfirmasi == 0){
                JOptionPane.showMessageDialog(null, "Menjalankan Ulang Program!","Pesan Peringatan",JOptionPane.WARNING_MESSAGE);
                continue;
            } else if(konfirmasi == 1){
                break;
            } else if(konfirmasi == 2) {
                break;
            }
        }
        }
    }
}
