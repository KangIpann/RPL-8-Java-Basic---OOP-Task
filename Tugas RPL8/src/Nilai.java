import javax.swing.*;

public class Nilai {
    public static void main(String[] args) {
        int konfirmasi;
        while (true) {
            String input = JOptionPane.showInputDialog("Masukan Nilai");
            int nilai = Integer.parseInt(input);
            String predikat = "";
            String riwayat = "";
            // Nilai
            if (nilai >= 96 && nilai <= 100) {
                JOptionPane.showMessageDialog(null, "Nilai anda adalah: \n" + "                     A");
                predikat = "A";
            } else if (nilai >= 91 && nilai <= 95) {
                JOptionPane.showMessageDialog(null, "Nilai anda adalah: \n" + "                     A-");
                predikat = "A-";
            } else if (nilai >= 86 && nilai <= 90) {
                JOptionPane.showMessageDialog(null, "Nilai anda adalah: \n" + "                     B+");
                predikat = "B+";
            } else if (nilai >= 81 && nilai <= 85) {
                JOptionPane.showMessageDialog(null, "Nilai anda adalah: \n" + "                     B");
                predikat = "B";
            } else if (nilai >= 75 && nilai <= 80) {
                JOptionPane.showMessageDialog(null, "Nilai anda adalah: \n" + "                     B-");
                predikat = "B-";
            } else if (nilai >= 70 && nilai <= 74) {
                JOptionPane.showMessageDialog(null, "Nilai anda adalah: \n" + "                     C+");
                predikat = "C+";
            } else if (nilai >= 65 && nilai <= 69) {
                JOptionPane.showMessageDialog(null, "Nilai anda adalah: \n" + "                     C ");
                predikat = "C";
            } else if (nilai >= 60 && nilai <= 64) {
                JOptionPane.showMessageDialog(null, "Nilai anda adalah: \n" + "                     C-");
                predikat = "C-";
            } else if (nilai >= 55 && nilai <= 59) {
                JOptionPane.showMessageDialog(null, "Nilai anda adalah: \n" + "                     D+");
                predikat = "D+";
            } else if (nilai >= 0 && nilai <= 54) {
                JOptionPane.showMessageDialog(null, "Nilai anda adalah: \n" + "                     D");
                predikat = "D";
            } else {
                JOptionPane.showMessageDialog(null, "Tolong Masukan Nilai 0 Sampai 100", "PERINGATAN!",
                        JOptionPane.WARNING_MESSAGE);
                continue;
            }

            // Kriteria
            konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Melihat Kriteria Anda?");
            if (konfirmasi == 0) {
                String kriteria1 = JOptionPane.showInputDialog(null,
                        "Masukan Predikat anda \n " + "                 Contoh: B+");
                String kriteria = kriteria1.toUpperCase();
                switch (kriteria) {
                    case "A":
                        JOptionPane.showMessageDialog(null, "Predikat Anda Adalah = Sangat Baik");
                        riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat + " Sangat Baik");
                        System.out.println(riwayat);
                        break;
                    case "A-":
                        JOptionPane.showMessageDialog(null, "Predikat Anda Adalah = Sangat Baik");
                        riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat + " Sangat Baik");
                        System.out.println(riwayat);
                        break;
                    case "B+":
                        JOptionPane.showMessageDialog(null, "Predikat Anda Adalah = Baik");
                        riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat + " Baik");
                        System.out.println(riwayat);
                        break;
                    case "B":
                        JOptionPane.showMessageDialog(null, "Predikat Anda Adalah = Baik");
                        riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat + " Baik");
                        System.out.println(riwayat);
                        break;
                    case "B-":
                        JOptionPane.showMessageDialog(null, "Predikat Anda Adalah = Baik");
                        riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat + " Baik");
                        System.out.println(riwayat);
                        break;
                    case "C+":
                        JOptionPane.showMessageDialog(null, "Predikat Anda Adalah = Cukup");
                        riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat + " Cukup Baik");
                        System.out.println(riwayat);
                        break;
                    case "C":
                        JOptionPane.showMessageDialog(null, "Predikat Anda Adalah = Cukup");
                        riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat + " Cukup Baik");
                        System.out.println(riwayat);
                        break;
                    case "C-":
                        JOptionPane.showMessageDialog(null, "Predikat Anda Adalah = Cukup");
                        riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat + " Cukup Baik");
                        System.out.println(riwayat);
                        break;
                    case "D+":
                        JOptionPane.showMessageDialog(null, "Predikat Anda Adalah = Kurang");
                        riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat + " Kurang");
                        System.out.println(riwayat);
                        break;
                    case "D":
                        JOptionPane.showMessageDialog(null, "Predikat Anda Adalah = Kurang");
                        riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat + " Kurang");
                        System.out.println(riwayat);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Masukan Predikat Sesuai Nilai!", "PERINGATAN!",
                                JOptionPane.WARNING_MESSAGE);
                        break;
                }
                break;
            } else if (konfirmasi == 1) {
                riwayat = ("Nilai Anda Adalah = " + nilai + " Berpredikat = " + predikat);
                System.out.println(riwayat);
                break;
            } else if (konfirmasi == 2) {
                break;
            }
        }
    }
}
