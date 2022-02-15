import javax.swing.JOptionPane;

public class tugasno6 {
    public static void main(String[] args) {
        String stringsuhu;
        int konfirmasiMasker;
        int konfirmasiSanitizer = 0;
        int konfirmasiAntigen = 0;
        int konfirmasiHasilAntigen = 0;
        int konfirmasiAula;
        int konfirmasiSwab = 0;
        JOptionPane.showMessageDialog(null, "Hai, Selamat datang di SMK Telkom Malang! ", "Welcome",
                JOptionPane.INFORMATION_MESSAGE);
        stringsuhu = JOptionPane.showInputDialog(null, "Silahkan masukan suhu kamu");
        double suhu = Double.parseDouble(stringsuhu);
        if (suhu <= 37) {
            JOptionPane.showMessageDialog(null, "Silahkan Menunjukan Prokes Yang Digunakan");
            konfirmasiMasker = JOptionPane.showConfirmDialog(null, "Apakah Sudah Memakai Masker?");
            if (konfirmasiMasker == 0) {
                konfirmasiSanitizer = JOptionPane.showConfirmDialog(null, "Apakah Sudah Membawa Hand Sanitizer?");
                if (konfirmasiSanitizer == 0) {
                    konfirmasiAntigen = JOptionPane.showConfirmDialog(null, "Apakah Sudah Membawa Hasil Swab Antigen?");

                    if (konfirmasiAntigen == 0) {
                        konfirmasiHasilAntigen = JOptionPane.showConfirmDialog(null, "Apakah Hasilnya Swab Negatif?");
                        if (konfirmasiHasilAntigen == 0) {
                            JOptionPane.showMessageDialog(null, "Silahkan Memasuki Kelas.", "Selamat!!!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
            if (konfirmasiMasker != 0) {
                JOptionPane.showMessageDialog(null, "Silahkan Pulang Atau Membeli Masker Terlebih Dahulu.",
                        "Mohon Maaf", JOptionPane.INFORMATION_MESSAGE);
            } else if (konfirmasiSanitizer == 1) {
                JOptionPane.showMessageDialog(null, "Silahkan Pulang Atau Membeli Hand Sanitizer Terlebih Dahulu.",
                        "Mohon Maaf", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (suhu >= 37) {
            JOptionPane.showMessageDialog(null, ("Mohon maaf! Suhu anda berada di " + suhu + "°C"
                    + " Dari yang diperbolehkan masuk yaitu dibawah 37°C"));
        }
        if (konfirmasiAntigen == 1) {
            JOptionPane.showMessageDialog(null, "Silahkan ke Aula Untuk Pengecekan Data");
            while (true) {
                konfirmasiAula = JOptionPane.showConfirmDialog(null, "Apakah Sudah Melakukan Pengecekan Data?");
                if (konfirmasiAula == 0) {
                    JOptionPane.showMessageDialog(null, "Silahkan Melakukan Swab.");
                    konfirmasiSwab = JOptionPane.showConfirmDialog(null, "Apakah Hasilnya Negatif?");
                    if (konfirmasiSwab == 0) {
                        JOptionPane.showMessageDialog(null, "Selamat! Silahkan Masuk Ke Kelas");
                        break;
                    }
                } else if (konfirmasiAula == 1) {
                    JOptionPane.showMessageDialog(null, "Mohon Tunggu Sampai Selesai Konfirmasi", "Peringatan!",
                            JOptionPane.WARNING_MESSAGE);
                } else if (konfirmasiAula == 2) {
                    break;
                }
                if (konfirmasiSwab == 1) {
                    JOptionPane.showMessageDialog(null, "Silahkan Masuk Ke UKS");
                    break;
                }
            }
        } else if (konfirmasiHasilAntigen == 1) {
            JOptionPane.showMessageDialog(null, "Silahkan Menuju Ke UKS Untuk Penanganan Lebih Lanjut");
        }
    }
}