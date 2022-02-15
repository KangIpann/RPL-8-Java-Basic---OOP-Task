import javax.swing.JOptionPane;

public class ujicoba {
    public static void main(String[] args) {
        String konfirmasi,konfirmasiJurusan;
        int konfirmasi2;
        int konfirmasi3;
        int konfirmasi4;
        konfirmasi4 = JOptionPane.showConfirmDialog(null,"Apakah Kamu Ingin Mengikuti Program Beasiswa?","BEASISWA", JOptionPane.YES_NO_CANCEL_OPTION);
        if (konfirmasi4 == 0){
            JOptionPane.showMessageDialog(null, "Hai, Selamat Datang Di Persyaratan Beasiswa!","HALO!!!",JOptionPane.INFORMATION_MESSAGE);
            konfirmasi = JOptionPane.showInputDialog(null,"Isikan Angkatan Kamu: ","ISIKAN DENGAN JUJUR!");
            konfirmasiJurusan = JOptionPane.showInputDialog(null,"Apakah Kamu RPL atau TKJ","ISIKAN DENGAN JUJUR!");
            if (konfirmasi.equalsIgnoreCase("30") && konfirmasiJurusan.equalsIgnoreCase("Rpl")){
                JOptionPane.showMessageDialog(null,"Silahkan melakukan Test Tulis!.", "Test Tulis",JOptionPane.INFORMATION_MESSAGE);
                konfirmasi2 = JOptionPane.showConfirmDialog(null,"Apakah Anda Lolos Test Tulis?","Test Tulis", JOptionPane.YES_NO_CANCEL_OPTION);
                if (konfirmasi2 == 0){
                    JOptionPane.showMessageDialog(null,"Selamat! Selanjutnya Silahkan Mengikuti Test Wawancara.","Selamat!",JOptionPane.INFORMATION_MESSAGE);
                    konfirmasi3 = JOptionPane.showConfirmDialog(null, "Apakah Anda Lolos Test Wawancara?","Test Wawancara", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (konfirmasi3 == 0){
                        JOptionPane.showMessageDialog(null,"Selamat! Anda Lolos Test Wawancara Dan Berhak Mendapatkan Program Beasiswa!","Selamat!!!",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Mohon Maaf. Anda Harus Gugur Disini. Silahkan Mencoba Lagi Di Kesempatan Berikutnya.","Mohon Maaf",JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Mohon Maaf. Anda Harus Gugur Disini. Silahkan Mencoba Lagi Di Kesempatan Berikutnya.","Mohon Maaf",JOptionPane.WARNING_MESSAGE);
                }
            }else {
                JOptionPane.showMessageDialog(null, "Mohon Maaf. Anda Tidak Bisa Mengikuti Beasiswa Ini.", "Mohon Maaf", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
